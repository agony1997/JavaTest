package org.kotlin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class HelloTest {

    val person = Person(1.7f, 65f)
    val man = org.example.Person(65f,1.7f)

    @Test
    fun bmiTest(){
        Assertions.assertEquals(65f / (1.7f*1.7f),person.bmi())
    }

    @Test
    fun bmiTestJava(){
        Assertions.assertEquals(65f / (1.7f*1.7f),man.bmi())
    }
}