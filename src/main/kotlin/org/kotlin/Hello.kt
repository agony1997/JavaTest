package org.kotlin

fun main() {

   /* Person().sayHi()

    val fan = Person()
    fan.sayHi()

    println(fan.weight)
    println(fan.bmi())

    print(Person(1.5f,65f).bmi())
    println()

    test()*/

    test2()
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
    val name = "gg"
    var age = 18
    val myAge = 5

    println(name + age)
    println(myAge)

    age=50
    println(age)
}

fun test2(){
    val scope = 60
    println(scope>50)

    val fl = 5.55553
    println(fl>scope)

    val ch = 'A'
    println(ch.toInt())
    println(ch.toInt()>6)
    println(ch.toByte())
    println(ch.toLong())
    println(ch.toFloat())

//    Kotlin 1.4 及以上版本中，Char.toInt() 已被標記為棄用

    println(ch.code.toInt())
    println(ch.code.toFloat())
    println(ch.code.toChar())

//    val string = "AAB"
//    println(string.toLong())
//    字串不給分割，因此不能轉換

    val stringNumber = "123"
    println(stringNumber.toInt())

}

// 沒有基本資料型態

// Unit是一種特殊的返回類型，表示一個函數沒有返回值。
// 它相當於 Java 中的 void，但在 Kotlin 中它是一個實際的類型。