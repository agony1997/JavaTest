package org.example.thread;

public class MinThread extends Thread {

    @Override
    public void run() {
        System.out.println("MinThread is running...");
        System.out.println("Min Thread Name: "+currentThread().getName());
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("min thread end");
    }


}
