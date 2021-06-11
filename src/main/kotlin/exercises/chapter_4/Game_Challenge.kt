package exercises.chapter_4

fun main() {
    val name = "Madrigal"
    val healthPoints = 88
    val isBlessed = true
    val isImmortal = false

    // Аура
    val auraColor = getAuraColor(isBlessed, healthPoints, isImmortal)
    val healthStatus = formatHealthStatus(healthPoints, isBlessed)

    // Состояние игрока
    printPlayerStatus(auraColor, isBlessed, name, healthStatus)

    printPlayerStatus(
        auraColor = "NONE",
        isBlessed = true,
        name = "Madrigal",
        healthStatus = healthStatus
    )

    castFireball(5)
    castFireball()

    // Кидает исключение
    shouldReturnAString()

}

private fun printPlayerStatus(
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healthStatus: String
) {
    println(
        "(Aura: $auraColor) " +
                "(Blessed: ${if (isBlessed) "YES" else "NO"})"
    )
    println("$name $healthStatus")
}

private fun getAuraColor(
    isBlessed: Boolean,
    healthPoints: Int,
    isImmortal: Boolean
): String {
    val auraVisible = (isBlessed && healthPoints > 50) || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"
    return auraColor
}

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) =
    when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> when (isBlessed) {
            true -> "has some minor wounds but is healing quite quickly!"
            false -> "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }

private fun castFireball(numFireballs: Int = 2) =
    println("A glass of Fireball springs into existence. (x$numFireballs)")

private fun shouldReturnAString(): String {
    TODO("should return a string")
    println("unreachable")
}