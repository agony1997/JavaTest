package org.example.school;

import java.util.Scanner;

public class Student {

    int id;
    String name;
    int english;
    int art;
    static int pass = 60;

    public Student() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter id");
        this.id = scanner.nextInt();
        System.out.println("Enter name");
        this.name = scanner.next();
        System.out.println("Enter english score");
        this.english = scanner.nextInt();
        System.out.println("Enter art score");
        this.art = scanner.nextInt();

        scanner.close();
    }

    public Student(int id, String name, int english, int art) {
        this.id = id;
        this.name = name;
        this.english = english;
        this.art = art;
    }

    public int getTop() {
        int top = (english > art) ? english : art ;
        return top;
    }

    public int getAverage(){
        return (english + art) / 2;

    }

    public void printStudent(){
        System.out.println("Name:"+name);
        System.out.println("English:"+english);
        System.out.println("Art:"+art);
        System.out.println("TopScore:"+getTop());
        System.out.println("AverageScore:"+getAverage());
        System.out.println(getAverage()>pass ? "pass" : "fail");
    }

    public void getRank(){
        String rank = "F";
        switch (getAverage()){
            case 10:
            case 9:
                rank="A";
                break;
            case 8:
                rank="B";
                break;
            case 7:
                rank="C";
                break;
            case 6:
                rank="D";
                break;
            case 5:
                rank="E";
                break;
        }
        System.out.println(rank);
    }

}
