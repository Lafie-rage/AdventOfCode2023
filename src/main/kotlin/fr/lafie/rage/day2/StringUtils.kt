package fr.lafie.rage.day2

fun String.toRound(): Round {
    val roundIndex = this.substringBefore(":").substringAfter(" ").toInt()
    val drafts = this.substringAfter(": ").split("; ").map {
        it.toDraft()
    }
    return Round(
        index = roundIndex,
        drafts = drafts,
    )
}

fun String.toDraft(): Draft {
    var redCount = 0
    var greenCount = 0
    var blueCount = 0

    this.split(", ").forEach {
        if (it.contains("blue")) {
            blueCount = it.substringBefore(" blue").toInt()
        } else if (it.contains("red")) {
            redCount = it.substringBefore(" red").toInt()
        } else if (it.contains("green")) {
            greenCount = it.substringBefore(" green").toInt()
        }
    }

    return Draft(
        blueCount = blueCount,
        redCount = redCount,
        greenCount = greenCount,
    )
}