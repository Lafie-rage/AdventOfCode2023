package fr.lafie.rage.day2

data class Round(
    val index: Int,
    val drafts: List<Draft>,
) {
    // region PART 1
    val isValid: Boolean
        get() = isRedCountValid
                && isGreenCountValid
                && isBlueCountValid

    private val isRedCountValid: Boolean
        get() = drafts.map { it.redCount }.maxOf { it } <= Day2.MAX_RED_CUBES

    private val isGreenCountValid: Boolean
        get() = drafts.map { it.greenCount }.maxOf { it } <= Day2.MAX_GREEN_CUBES

    private val isBlueCountValid: Boolean
        get() = drafts.map { it.blueCount }.maxOf { it } <= Day2.MAX_BLUE_CUBES
    // endregion

    // region PART 2
    val minRequiredRedCubes: Int
        get() = drafts.map { it.redCount }.maxOf { it }
    val minRequiredGreenCubes: Int
        get() = drafts.map { it.greenCount }.maxOf { it }
    val minRequiredBlueCubes: Int
        get() = drafts.map { it.blueCount }.maxOf { it }
    // endregion
}
