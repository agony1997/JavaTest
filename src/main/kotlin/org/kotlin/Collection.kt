package org.kotlin

fun main() {

    val list = listOf(1, 2, 3, 4)
    val list2 = mutableListOf(1, 2, 3, 4)

    println(list.listIterator())
    list2.removeFirst()

}