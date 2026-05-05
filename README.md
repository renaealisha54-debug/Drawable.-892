# GhostAvatar Overlay

### 🚀 Overview
GhostAvatar is an Android-based personalization tool that uses a `SYSTEM_ALERT_WINDOW` to render a 5-point rigged character over any active application.

### 🦴 Rigging System
All custom drawings or uploaded assets are mapped to a 5-point skeleton:
- **A**: Head | **B/C**: Hands | **D/E**: Feet
Animations are calculated using relative offsets from the center of mass.

### ☁️ Firebase Structure
- **/users/{uid}/avatar**: Stores JSON representation of 5-point coordinates and clothing IDs.
- **/users/{uid}/reactions**: Maps `notification_type` (e.g., "WHATSAPP") to `animation_id` (e.g., "JUMP").

### 🛠 Setup
1. Create a Firebase Project and add `google-services.json` to `/android-app`.
2. Enable **Firestore** and **Anonymous Auth** (or Google Sign-in).
3. Deploy Cloud Functions: `cd firebase/functions && firebase deploy`.
4. Grant **"Display over other apps"** and **"Notification Access"** manually in Android settings on first launch.
