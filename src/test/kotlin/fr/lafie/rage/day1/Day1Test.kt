package fr.lafie.rage.day1

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class Day1Test {

    @Test
    fun firstPart() {
        val input = listOf(
            "1abc2",
            "pqr3stu8vwx",
            "a1b2c3d4e5f",
            "treb7uchet",
        )
        val result = Day1.firstPart(input)
        assertThat(result).isEqualTo(142)
    }

    @Test
    fun secondPart() {
        val input = listOf(
            "two1nine",
            "eightwothree",
            "abcone2threexyz",
            "xtwone3four",
            "4nineeightseven2",
            "zoneight234",
            "7pqrstsixteen",
        )
        val result = Day1.secondPart(input)
        assertThat(result).isEqualTo(281)
    }
}