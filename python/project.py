import cv2
import mediapipe as mp
import numpy as np
import pyautogui

# Initialize MediaPipe Hand Tracking
mp_hands = mp.solutions.hands
hands = mp_hands.Hands(max_num_hands=1, min_detection_confidence=0.7)
mp_draw = mp.solutions.drawing_utils

# Start video capture
cap = cv2.VideoCapture(0)

while cap.isOpened():
    ret, frame = cap.read()
    if not ret:
        break

    # Flip image for natural hand movement & convert to RGB
    frame = cv2.flip(frame, 1)
    frame_rgb = cv2.cvtColor(frame, cv2.COLOR_BGR2RGB)

    # Process frame & detect hands
    results = hands.process(frame_rgb)

    # Extract hand landmarks
    if results.multi_hand_landmarks:
        for hand_landmarks in results.multi_hand_landmarks:
            mp_draw.draw_landmarks(frame, hand_landmarks, mp_hands.HAND_CONNECTIONS)

            # Get coordinates of key fingers
            h, w, _ = frame.shape
            thumb_tip = hand_landmarks.landmark[4]
            index_tip = hand_landmarks.landmark[8]
            middle_tip = hand_landmarks.landmark[12]
            ring_tip = hand_landmarks.landmark[16]
            pinky_tip = hand_landmarks.landmark[20]
            
            # Convert to pixel coordinates
            thumb_x, thumb_y = int(thumb_tip.x * w), int(thumb_tip.y * h)
            index_x, index_y = int(index_tip.x * w), int(index_tip.y * h)
            middle_x, middle_y = int(middle_tip.x * w), int(middle_tip.y * h)
            ring_x, ring_y = int(ring_tip.x * w), int(ring_tip.y * h)
            pinky_x, pinky_y = int(pinky_tip.x * w), int(pinky_tip.y * h)

            # Calculate distances
            dist_thumb_index = np.linalg.norm(np.array([thumb_x, thumb_y]) - np.array([index_x, index_y]))
            dist_index_pinky = np.linalg.norm(np.array([index_x, index_y]) - np.array([pinky_x, pinky_y]))

            # **Gesture Recognition**
            if dist_thumb_index > 100 and dist_index_pinky > 100:  
                cv2.putText(frame, "Zoom In", (50, 50), cv2.FONT_HERSHEY_SIMPLEX, 1, (0, 255, 0), 2) 
                pyautogui.hotkey("ctrl", "+")  # Zoom in

            elif dist_thumb_index < 50:  
                cv2.putText(frame, "Zoom Out", (50, 50), cv2.FONT_HERSHEY_SIMPLEX, 1, (0, 0, 255), 2) 
                pyautogui.hotkey("ctrl", "-")  # Zoom out

            elif abs(index_x - pinky_x) > 150 and abs(index_y - pinky_y) < 50:  
                cv2.putText(frame, "Next Slide", (50, 50), cv2.FONT_HERSHEY_SIMPLEX, 1, (255, 0, 0), 2)
                pyautogui.press("right")  # Next slide

            elif abs(index_x - pinky_x) < 50 and abs(index_y - pinky_y) > 150:  
                cv2.putText(frame, "Previous Slide", (50, 50), cv2.FONT_HERSHEY_SIMPLEX, 1, (255, 0, 255), 2)
                pyautogui.press("left")  # Previous slide

            elif abs(index_y - middle_y) < 20:  
                cv2.putText(frame, "Pause/Play", (50, 50), cv2.FONT_HERSHEY_SIMPLEX, 1, (0, 255, 255), 2)
                pyautogui.press("space")  # Pause/Play

    cv2.imshow("Hand Gesture Control", frame)

    if cv2.waitKey(1) & 0xFF == ord("q"):
        break

cap.release()
cv2.destroyAllWindows()     
