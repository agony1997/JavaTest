package org.example.school;

import java.util.Scanner;

public class GraduateStudent extends Student {

    int thesis;
    static int pass = 30;

    public GraduateStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter id");
        this.id = scanner.nextInt();
        System.out.println("Enter name");
        this.name = scanner.next();
        System.out.println("Enter english score");
        this.english = scanner.nextInt();
        System.out.println("Enter art score");
        this.art = scanner.nextInt();
        System.out.println("Enter thesis score");
        this.thesis = scanner.nextInt();
        scanner.close();
    }

    @Override
    public void printStudent() {
        System.out.println("Name:" + name);
        System.out.println("English:" + english);
        System.out.println("Art:" + art);
        System.out.println("thesis:" + thesis);
        System.out.println("TopScore:" + getTop());
        System.out.println("AverageScore:" + getAverage());
        System.out.println(getAverage() > pass ? "pass" : "fail");
    }

    @Override
    public int getAverage() {
        return (english + art + thesis) / 3;
    }
}