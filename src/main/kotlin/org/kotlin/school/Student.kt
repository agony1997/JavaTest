package org.kotlin.school

import java.util.*

fun main() {
    Student("Min",60,80).printScore()
    Student("wang",50)
    Student()

    BigStudent()
    BigStudent("big",20,15)
}

class Student(var name : String, var mathScore: Int,var artScore: Int) {

    constructor() : this("",0,0) {
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

    fun printScore(){
        println("Name = $name, MathScore = $mathScore, ArtScore = $artScore")
    }
}

class BigStudent {
    var name : String
    var mathScore : Int
    var artScore : Int

    constructor(name: String, mathScore: Int, artScore: Int) {
        this.name = name
        this.mathScore = mathScore
        this.artScore = artScore
        printScore()
    }

    constructor() : this("",0,0) {
        println("無參建構")
        printScore()
    }

    fun printScore(){
        println("Name = $name, MathScore = $mathScore, ArtScore = $artScore")
    }
}