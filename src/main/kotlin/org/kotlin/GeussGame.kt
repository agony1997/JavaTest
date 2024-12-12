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

//特性	      readLine()	                  readln()
//返回值	      String?（可空）	                  String（不可空）
//空行行為	  返回 null	                      返回空字串 ""
//例外處理	  不會拋出異常	                  必須有輸入（拋出 EOFException 如果輸入終止）
//用途	      處理可能為空的輸入場景	          保證輸入存在，處理必須有輸入的場景
//Kotlin版本	  自Kotlin 起初版本提供	          Kotlin 1.6 起新增
