package org.kotlin

import kotlin.random.Random

fun main() {

    val target = Random.nextInt(10) + 1
    println("target is $target")

    var enter = 0
    val times = 4

    for (i in 1..times) {
        println("Enter nuber")
        enter = readlnOrNull()?.toIntOrNull() ?: 0

        if (enter > target)
            println("Lower, you have ${times - i} times")
        else if (enter < target)
            println("Upper, you have ${times - i} times")
        else if (enter == -1)
            break
        else
            println("Bingo")
    }
    println("Game Over")
}

private fun guessGame() {
    val target = Random.nextInt(10) + 1
    println("target = $target")

    var readNumber = 0

    while (readNumber != target) {

        println("Enter your number")
        readNumber = readLine()?.toIntOrNull() ?: 0

        if (readNumber > target) {
            println("Lower")
        } else if (readNumber < target) {
            println("Higher")
        } else {
            println("Bingo")
        }
    }
}

//特性	      readLine()	                  readln()
//返回值	      String?（可空）	                  String（不可空）
//空行行為	  返回 null	                      返回空字串 ""
//例外處理	  不會拋出異常	                  必須有輸入（拋出 EOFException 如果輸入終止）
//用途	      處理可能為空的輸入場景	          保證輸入存在，處理必須有輸入的場景
//Kotlin版本	  自Kotlin 起初版本提供	          Kotlin 1.6 起新增
