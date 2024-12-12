package org.kotlin

import kotlin.random.Random

fun main() {
//    val scanner = Scanner(System.`in`)

    val target = Random.nextInt(10) + 1
    println("target = $target")

    var readNumber = 0

    while (readNumber != target) {

        println("Enter your number")
        readNumber = readLine()?.toIntOrNull()?:0

        if (readNumber > target) {
            println("Lower")
        } else if (readNumber < target) {
            println("Higher")
        } else {
            println("Bingo")
        }
    }


}
