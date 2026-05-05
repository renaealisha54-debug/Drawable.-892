class NotificationCatchService : NotificationListenerService() {
    override fun onNotificationPosted(sbn: StatusBarNotification) {
        val packageName = sbn.packageName
        val intent = Intent("GHOST_AVATAR_TRIGGER").apply {
            putExtra("package_source", packageName)
        }
        sendBroadcast(intent)
    }
}
