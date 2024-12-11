package org.example.school;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    void topTest(){
        Student student = new Student(1,"abc",100,60);
        Assertions.assertEquals(100,student.getTop());
    }

    @Test
    void averageTest(){
        Student student = new Student(1,"abc",100,60);
        Assertions.assertEquals((100+60)/2,student.getAverage());
    }
}
