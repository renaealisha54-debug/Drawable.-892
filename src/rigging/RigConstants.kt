data class AvatarPoints(
    val head: PointF,   // Point A
    val rHand: PointF,  // Point B
    val lHand: PointF,  // Point C
    val rFoot: PointF,  // Point D
    val lFoot: PointF   // Point E
)

// Logic to auto-scale clothing based on Point A and Point D/E distance
fun calculateClothingScale(points: AvatarPoints): Float {
    val bodyHeight = points.rFoot.y - points.head.y
    return bodyHeight / DEFAULT_REFERENCE_HEIGHT
}
