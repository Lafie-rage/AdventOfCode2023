package fr.lafie.rage.day1

import fr.lafie.rage.utils.readFile

fun main() {
    val part1Result = Day1.firstPart(readFile(1))
    println("Part 1 : $part1Result")

    val part2Result = Day1.secondPart(readFile(1))
    println("Part 2 : $part2Result")
}

object Day1 {

    fun firstPart(messages: List<String>): Int = messages.sumOf { message ->
        val firstNumber = message.first { it.isDigit() }.digitToInt()
        val lastNumber = message.last { it.isDigit() }.digitToInt()
        return@sumOf (firstNumber * 10) + lastNumber
    }

    fun secondPart(messages: List<String>): Int = messages.sumOf { message ->
        val firstNumber = getFirstNumber(message)
        val lastNumber = getLastNumber(message)
        return@sumOf (firstNumber * 10) + lastNumber
    }

    private fun getFirstNumber(message: String): Int {
        var subMessage = message
        do {
            subMessage.startingSpelledNumberValue()?.let {
                // If it's starting with a spelled number, returns its value
                return it
            }
            if (subMessage[0].isDigit()) {
                // If it's starting with a digit, returns its value
                return subMessage[0].digitToInt()
            }
            subMessage = subMessage.substring(1)
        } while (subMessage.isNotEmpty())
        throw RuntimeException() // Impossible
    }

    private fun getLastNumber(message: String): Int {
        var subMessage = message
        do {
            subMessage.endingSpelledNumberValue()?.let {
                // If it's ending with a spelled number, returns its value
                return it
            }
            if (subMessage[subMessage.lastIndex].isDigit()) {
                // If it's ending with a digit, returns its value
                return subMessage[subMessage.lastIndex].digitToInt()
            }
            subMessage = subMessage.substring(0, subMessage.lastIndex)
        } while (subMessage.isNotEmpty())
        throw RuntimeException() // Impossible
    }

}

