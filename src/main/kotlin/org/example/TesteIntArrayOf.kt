package org.example

fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    values.forEach { print("$it ") }

    println()

    values.sort()
    values.forEach { print("$it ") }
}