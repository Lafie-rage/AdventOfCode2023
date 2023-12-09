package fr.lafie.rage.day1


private val spelledNumberToValue = mapOf(
    "zero" to 0,
    "one" to 1,
    "two" to 2,
    "three" to 3,
    "four" to 4,
    "five" to 5,
    "six" to 6,
    "seven" to 7,
    "eight" to 8,
    "nine" to 9,
)

fun String.startingSpelledNumberValue(): Int? {
    spelledNumberToValue.forEach {
        if (this.startsWith(it.key)) return it.value
    }
    return null
}

fun String.endingSpelledNumberValue(): Int? {
    spelledNumberToValue.forEach {
        if (this.endsWith(it.key)) return it.value
    }
    return null
}