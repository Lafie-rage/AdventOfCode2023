package fr.lafie.rage.day2

import fr.lafie.rage.utils.readFile

fun main() {
    val part1result = Day2.firstPart(readFile(2))
    println("Part 1 : $part1result")

    val part2result = Day2.secondPart(readFile(2))
    println("Part 2 : $part2result")
}

object Day2 {

    const val MAX_RED_CUBES = 12
    const val MAX_GREEN_CUBES = 13
    const val MAX_BLUE_CUBES = 14

    fun firstPart(rounds: List<String>): Int = rounds
        .map(String::toRound)
        .filter(Round::isValid)
        .sumOf(Round::index)

    fun secondPart(rounds: List<String>): Int = rounds
        .map(String::toRound).sumOf { it.minRequiredRedCubes * it.minRequiredBlueCubes * it.minRequiredGreenCubes }
}