package org.example.school;

import org.kotlin.school.Student;

public class SchoolRunner {

    public static void main(String[] args) {

//        Student student = new Student();

        org.kotlin.school.Student student1 = new org.kotlin.school.Student();

        System.out.println(student1.getPass());
        System.out.println(Student.getPass());
        Student.Companion.test();
        System.out.println("中文測試");

//        student.printStudent();
//        student.getRank();
//
//        GraduateStudent graduateStudent = new GraduateStudent();
//        graduateStudent.printStudent();
//        graduateStudent.getRank();

    }
}
