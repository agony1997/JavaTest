package org.kotlin.school

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SchoolTest {

    val student = Student("Agony",5,100)

    @Test
    fun getTopTest(){
        Assertions.assertEquals(100,student.getTop())
    }

    @Test
    fun getAverageTest(){
        Assertions.assertEquals((5+100)/2,student.getAverageScore())
    }

    @Test
    fun getGradeTest(){
        Assertions.assertEquals('F',student.getGrand())
    }
}