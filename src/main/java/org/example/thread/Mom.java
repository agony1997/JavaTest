package org.example.thread;

public class Mom {

    public Mom() throws InterruptedException {
        System.out.println("cooking 1");
        Thread.sleep(3000);
        System.out.println("cooking 1 finished");
        System.out.println("cooking 2");

//        new MinThread().start();

        Thread thread1 = new Thread() {

            public void run() {
                System.out.println("MinThread is running...");
                System.out.println("Min Thread Name: " + currentThread().getName());
                try {
                    sleep(8000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("min thread end");
            }
        };

        thread1.start();

       /* Min min = new Min() {

            @Override
            public void doSomething() throws InterruptedException {
                System.out.println("go");
                Thread.sleep(6000);
                System.out.println("go finished");
            }
        };
        min.doSomething();*/

        Thread.sleep(2000);
        System.out.println("cooking 2 finished");

  /*      Thread.sleep(2000);
        System.out.println("cooking 3");
        System.out.println("cooking 3 finished");*/
    }

    public static void main(String[] args) {
        try {
            Mom mom = new Mom();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
