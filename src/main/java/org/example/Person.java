package org.example;

public class Person {
    float height;
    float weight;

    public Person(float weight, float height) {
        this.height = height;
        this.weight = weight;
    }

    public float bmi() {
        float bmi = weight / (height * height);
        return bmi;
    }
}
