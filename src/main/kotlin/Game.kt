fun main() {
    val name = "Madrigal"
    val healthPoints = 88
    val isBlessed = true
    val isImmortal = false

    val healthStatus = formatHealthStatus(healthPoints, isBlessed)

    // Состояние игрока
    val auraVisible = (isBlessed && healthPoints > 50) || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"
    println("(Aura: $auraColor) " +
    "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")

    val race = "gnome"
    val faction = when (race) {
        "dwarf" -> "Keepers of the Mines"
        "gnome" -> "Keepers of the Mines"
        "orc" -> "Free People of the Rolling Hills"
        "human" -> "Free People of the Rolling Hills"
        else -> "Strange people..."
    }
    println("Race: $race. Faction: $faction")

}

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean): String {
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
    return healthStatus
}