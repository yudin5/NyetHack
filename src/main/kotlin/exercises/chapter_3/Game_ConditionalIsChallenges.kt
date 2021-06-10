package exercises.chapter_3

import kotlin.math.pow

fun main() {
    val name = "Estragon"
    val healthPoints = 88
    val isBlessed = true
    val isImmortal = false

    val healthStatus = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> when (isBlessed) {
            true -> "has some minor wounds but is healing quite quickly!"
            false -> "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }

    // Состояние игрока
    val karma = (Math.random().pow((110 - healthPoints) / 100.0) * 20).toInt()
    val auraColor = when (karma) {
        in 0..5 -> "RED"
        in 6..10 -> "ORANGE"
        in 11..15 -> "PURPLE"
        in 16..20 -> "GREEN"
        else -> "NONE"
    }
    val auraVisible = (isBlessed && healthPoints > 50) || isImmortal

    println("(Aura: ${if (auraVisible) auraColor else "NONE"}) " +
    "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")

    // val statusFormatString = "(HP)(A) -> H"
    val statusFormatString = "(HP: $healthPoints)(Aura: $auraColor) -> $healthStatus"
    println("statusFormatString = $statusFormatString")

    val race = "gnome"
    val faction = when (race) {
        "dwarf" -> "Keepers of the Mines"
        "gnome" -> "Keepers of the Mines"
        "orc" -> "Free People of the Rolling Hills"
        "human" -> "Free People of the Rolling Hills"
        else -> "Strange people..."
    }

}