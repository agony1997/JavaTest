package org.example.lottery;

public class TestGame {
    public static void main(String[] args) {

        Game369 game369 = new Game369();
        System.out.println(game369.validate());
        game369.generate();


        BigGame bigGame = new BigGame();
        System.out.println(bigGame.validate());
        bigGame.generate();


    }
}
