package org.kotlin.school

import org.kotlin.school.Student.Companion
import java.util.*

fun main() {
//    val student = Student("meme", 60, 80)
//    println(student.getTop())
//    println(student.checkPass())
//    student.printScore()

    val graduateStudent = GraduateStudent("meme",85,90,90)
    println(graduateStudent.getTop())
    println(graduateStudent.getAverageScore())
    println(graduateStudent.checkPass())
    graduateStudent.printScore()
    println(GraduateStudent.pass)
//    println(graduateStudent.pass)
}

private fun test() {
    Student("wang", 50)
    Student()
    BigStudent()
    BigStudent("big", 20, 15)
}

class GraduateStudent(name: String?, mathScore: Int, artScore: Int, var thesis: Int) :
    Student(name, mathScore, artScore) {

        companion object {
            var pass = 98;
        }

    override fun getAverageScore(): Int {
        return (mathScore + artScore + thesis) / 3;
    }
    // 沒覆寫方法還是會回去用父類的companion pass
    // 即使子類有寫 companion pass
    override fun checkPass(): Boolean =
        if (getAverageScore() > pass)
            true
        else
            false

}


open class Student(var name: String?, var mathScore: Int, var artScore: Int) {

    companion object {
        @JvmStatic
        var pass = 80
        fun test() {
            println("我在companion")
        }
    }

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

    open fun getTop() = if (mathScore > artScore) {
        mathScore
    } else if (artScore > mathScore) {
        artScore
    } else {
        println("have multiple top score")
        mathScore
    }


//    An expression is any valid unit of code that resolves to a value.
//    > 任何會回傳值的程式碼片段都算是表達式

    open fun getAverageScore() = (mathScore + artScore) / 2

    fun getGrand() = when (getAverageScore()) {
        100, 99 -> 'S'
        in 90..98 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        else -> 'F'
    }

    open fun checkPass(): Boolean =
        if (getAverageScore() > pass)
            true
        else
            false


    fun printScore() {
        println("Name = $name, MathScore = $mathScore, ArtScore = $artScore")
        println("TopScore = ${getTop()}, AverageScore = ${getAverageScore()}, Grand = ${getGrand()}")
        println("Pass = ${if (checkPass()) "YES" else "NO"}")
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