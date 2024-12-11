package org.kotlin

fun main() {

    var string = "abcd"

    println(string)
    println(string.length)
    println(string.replace('b','c'))
    println(string.get(1))

    var nullString: String? = null
    println(nullString)
    println(nullString?.length)
    println(nullString?.get(2))

    

}