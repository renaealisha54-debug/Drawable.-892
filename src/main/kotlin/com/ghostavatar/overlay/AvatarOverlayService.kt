class AvatarOverlayService : Service() {
    private lateinit var windowManager: WindowManager
    private lateinit var avatarView: View

    override fun onCreate() {
        super.onCreate()
        windowManager = getSystemService(WINDOW_SERVICE) as WindowManager
        
        val params = WindowManager.LayoutParams(
            WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY,
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
            PixelFormat.TRANSLUCENT
        )
        
        // Inflate avatar and add to WindowManager
        avatarView = LayoutInflater.from(this).inflate(R.layout.overlay_avatar, null)
        windowManager.addView(avatarView, params)
    }
}
