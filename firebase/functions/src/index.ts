import * as functions from "firebase-functions";

export const onNotificationTrigger = functions.firestore
    .document('triggers/{userId}')
    .onUpdate((change, context) => {
        const newValue = change.after.data();
        // Send a high-priority FCM to the device to wake the Overlay Service
        return admin.messaging().sendToDevice(newValue.fcmToken, {
            data: {
                action: "PLAY_ANIMATION",
                animationType: newValue.lastNotificationType
            }
        });
    });
