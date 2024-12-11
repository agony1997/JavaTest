package org.example.lottery;

public class BigGame extends NumberGame {

    int count = 6 ;

    @Override
    public void generate() {
        System.out.println("BigGame is generating");
    }
}
