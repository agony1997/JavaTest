package org.kotlin.school

import java.util.*

fun main() {
    Student(null, 60, 80).printScore()
}

private fun test() {
    Student("wang", 50)
    Student()
    BigStudent()
    BigStudent("big", 20, 15)
}

class Student(var name: String?, var mathScore: Int, var artScore: Int) {

    constructor() : this("", 0, 0) {
        val scanner = Scanner(System.`in`)
        print("Enter name")
        name = scanner.nextLine()
        print("Enter MathScore")
        mathScore = scanner.nextInt()
        print("Enter ArtScore")
        artScore = scanner.nextInt()
        printScore()
    }

    constructor(name: String, mathScore: Int) : this(name, mathScore, 0) {
        println("兩參建構子")
        printScore()
    }

    fun getTop() = if (mathScore > artScore) {
        mathScore
    } else if (artScore > mathScore) {
        artScore
    } else {
        println("have multiple top score")
        mathScore
    }


//    An expression is any valid unit of code that resolves to a value.
//    > 任何會回傳值的程式碼片段都算是表達式

    fun getAverageScore() = (mathScore + artScore) / 2

    fun getGrand() = when (getAverageScore()) {
        100, 99 -> 'S'
        in 90..98 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        else -> 'F'
    }


    fun printScore() {
        println("Name = $name, MathScore = $mathScore, ArtScore = $artScore")
        println("TopScore = ${getTop()}, AverageScore = ${getAverageScore()}, Grand = ${getGrand()}")
//        println(
//            name + "\t" + mathScore + "\t" + artScore + "\t" + getAverageScore() + "\t" + if (getAverageScore() > 60) "pass" else "fail"
//        )
    }

    fun checkName() {
        println("--- ${name?.get(2)}")
        try {
            println(name!!.length)
        } catch (e: Exception) {
            e.printStackTrace()
            println("catch null")
        }
        println("over")
    }
}


// --------------------------------------------------

class BigStudent {
    var name: String
    var mathScore: Int
    var artScore: Int

    constructor(name: String, mathScore: Int, artScore: Int) {
        this.name = name
        this.mathScore = mathScore
        this.artScore = artScore
        printScore()
    }

    constructor() : this("", 0, 0) {
        println("無參建構")
        printScore()
    }

    fun printScore() {
        println("Name = $name, MathScore = $mathScore, ArtScore = $artScore")
    }
}