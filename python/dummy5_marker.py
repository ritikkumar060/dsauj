import cv2
import mediapipe as mp
import numpy as np
import pyautogui
import time  

# Initialize MediaPipe Hand Tracking
mp_hands = mp.solutions.hands
hands = mp_hands.Hands(max_num_hands=1, min_detection_confidence=0.7)
mp_draw = mp.solutions.drawing_utils

# Start video capture
cap = cv2.VideoCapture(0)

# Create a black canvas for drawing
canvas = np.zeros((480, 640, 3), dtype=np.uint8)

# Variable to track marker mode
marker_mode = False
prev_x, prev_y = None, None  # Store previous index finger position

while cap.isOpened():
    ret, frame = cap.read()
    if not ret:
        break

    # Flip image for natural hand movement & convert to RGB
    frame = cv2.flip(frame, 1)
    frame_rgb = cv2.cvtColor(frame, cv2.COLOR_BGR2RGB)

    # Process frame & detect hands
    results = hands.process(frame_rgb)

    if results.multi_hand_landmarks:
        for hand_landmarks in results.multi_hand_landmarks:
            mp_draw.draw_landmarks(frame, hand_landmarks, mp_hands.HAND_CONNECTIONS)

            # Get screen dimensions
            h, w, _ = frame.shape

            # Get key finger coordinates
            index_tip = hand_landmarks.landmark[8]
            middle_tip = hand_landmarks.landmark[12]
            pinky_tip = hand_landmarks.landmark[20]

            # Convert to pixel coordinates
            index_x, index_y = int(index_tip.x * w), int(index_tip.y * h)
            middle_x, middle_y = int(middle_tip.x * w), int(middle_tip.y * h)
            pinky_x, pinky_y = int(pinky_tip.x * w), int(pinky_tip.y * h)

            # Gesture Recognition
            if abs(index_x - pinky_x) > 150 and abs(index_y - pinky_y) < 50:  
                cv2.putText(frame, "Next Slide", (50, 50), cv2.FONT_HERSHEY_SIMPLEX, 1, (255, 0, 0), 2)
                pyautogui.press("right")  
                time.sleep(1)  

            elif abs(index_x - pinky_x) < 50 and abs(index_y - pinky_y) > 150:  
                cv2.putText(frame, "Previous Slide", (50, 50), cv2.FONT_HERSHEY_SIMPLEX, 1, (255, 0, 255), 2)
                pyautogui.press("left")  
                time.sleep(1)  

            # Marker Mode (Activate when Index Finger is Raised)
            if index_y < middle_y:  # Index finger above middle finger
                marker_mode = True
                cv2.putText(frame, "Marker Mode ON", (50, 100), cv2.FONT_HERSHEY_SIMPLEX, 1, (0, 255, 255), 2)
            else:
                marker_mode = False
                prev_x, prev_y = None, None  # Reset previous position

            # Drawing Mode
            if marker_mode:
                if prev_x is not None and prev_y is not None:
                    cv2.line(canvas, (prev_x, prev_y), (index_x, index_y), (0, 255, 0), 5)  # Green color

                prev_x, prev_y = index_x, index_y

            # Clear Canvas (All Fingers Open)
            fingers_open = sum(1 for i in range(5) if hand_landmarks.landmark[i * 4].y < hand_landmarks.landmark[(i * 4) + 3].y)
            if fingers_open == 5:
                canvas[:] = 0  # Clear the drawing

    # Merge the frame and drawing
    frame = cv2.addWeighted(frame, 1, canvas, 0.7, 0)

    cv2.imshow("Hand Gesture Control", frame)

    if cv2.waitKey(1) & 0xFF == ord("q"):
        break

cap.release()
cv2.destroyAllWindows()
