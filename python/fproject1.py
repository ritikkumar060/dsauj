import cv2
import mediapipe as mp
import pyautogui
import time

mp_drawing = mp.solutions.drawing_utils
mp_drawing_styles = mp.solutions.drawing_styles
mp_hands = mp.solutions.hands

cap = cv2.VideoCapture(0)
prev_wrist = None
prev_time = 0
cooldown = 1  # seconds 



def get_finger_states(landmarks):
    states = []
    # Thumb
    states.append(landmarks[4][0] < landmarks[3][0])
    # Fingers: index, middle, ring, pinky
    for tip, pip in [(8, 6), (12, 10), (16, 14), (20, 18)]:
        states.append(landmarks[tip][1] < landmarks[pip][1])
    return states  # [thumb, index, middle, ring, pinky]


def is_palm(signs):
    return all(signs)


def detect_swipe(curr, prev):
    if prev is None:
        return None
    dx = curr[0] - prev[0]
    dy = curr[1] - prev[1]
    threshold = 0.05
    if abs(dx) > abs(dy):
        if dx > threshold:
            return 'right'
        elif dx < -threshold:
            return 'left'
    else:
        if dy > threshold:
            return 'down'
        elif dy < -threshold:
            return 'up'
    return None


with mp_hands.Hands(
        model_complexity=1,
        min_detection_confidence=0.7,
        min_tracking_confidence=0.7) as hands:

    while cap.isOpened():
        success, image = cap.read()
        image = cv2.flip(image, 1)
        if not success:
            continue

        image.flags.writeable = False
        image_rgb = cv2.cvtColor(image, cv2.COLOR_BGR2RGB)
        results = hands.process(image_rgb)

        image.flags.writeable = True
        image = cv2.cvtColor(image_rgb, cv2.COLOR_RGB2BGR)

        if results.multi_hand_landmarks:
            for hand_landmarks in results.multi_hand_landmarks:
                landmarks = [[lm.x, lm.y] for lm in hand_landmarks.landmark]
                signs = get_finger_states(landmarks)

                wrist = landmarks[0]  # WRIST
                curr_time = time.time()

                # Swipe detection
                swipe = detect_swipe(wrist, prev_wrist)
                if swipe and curr_time - prev_time > cooldown:
                    pyautogui.press(swipe)
                    prev_time = curr_time

                # Play/Pause (Palm)
                elif is_palm(signs) and curr_time - prev_time > cooldown:
                    pyautogui.press("space")  # play/pause toggle
                    prev_time = curr_time

                prev_wrist = wrist
                mp_drawing.draw_landmarks(
                    image,
                    hand_landmarks,
                    mp_hands.HAND_CONNECTIONS,
                    mp_drawing_styles.get_default_hand_landmarks_style(),
                    mp_drawing_styles.get_default_hand_connections_style())

        cv2.imshow('Gesture Media Control', image)
        key = cv2.waitKey(5) & 0xFF
        if key == 27 or key == ord('q'):
            break

cap.release()
cv2.destroyAllWindows()