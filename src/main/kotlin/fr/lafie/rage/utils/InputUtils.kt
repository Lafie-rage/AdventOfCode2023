package fr.lafie.rage.utils

import java.io.File

private const val RESOURCE_PATH = "./src/main/resources/"

fun readFile(
    dayIndex: Int,
    delimiter: String = "\n"
): List<String> {
    val path = "$RESOURCE_PATH/day_${dayIndex}/input.txt"
    return File(path).readText().split(delimiter)
}