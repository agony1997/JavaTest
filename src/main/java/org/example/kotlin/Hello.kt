package org.example.kotlin

fun main() {

    Person().sayHi()

    var fan = Person()
    fan.sayHi()

    println(fan.weight)
    println(fan.bmi())

    print(Person(1.5f,65f).bmi())
    println()

    test()
}


class Person(private var height:Float, var weight:Float) {

    init {
        println("建構子完成後執行init區...")
    }

    // 次要建構子
    constructor() : this(0f, 0f)

    fun sayHi() {
        println("Hi")
    }

    fun bmi(): Float {
        val bmi = weight / (height * height)
        return bmi
    }
}


fun test() {
    var name = "gg"
    var age = 18
    var myage: Int = 5
    println(name + age)
    println(myage)
}

// 沒有基本資料型態

// Unit 是一種特殊的返回類型，表示一個函數沒有返回值。
// 它相當於 Java 中的 void，但在 Kotlin 中它是一個實際的類型。