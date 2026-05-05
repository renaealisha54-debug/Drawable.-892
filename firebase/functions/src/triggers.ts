export const checkInactivity = functions.pubsub.schedule('every 5 minutes').onRun(async (context) => {
    // Logic to check last user interaction from Firestore
    // If > X minutes, trigger "Bored/Sleeping" animation on device
});
