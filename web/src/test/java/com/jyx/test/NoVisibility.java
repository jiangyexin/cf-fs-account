package com.jyx.test;

/**
 * @author: jiangyexin
 * @Description:
 * @Date: 2018-03-26 18:37
 **/
public class NoVisibility {
    private static boolean ready = false;
    private static int number;
    private static class ReaderThread extends Thread {
        public void run() {
            while (!ready) {
                System.out.println("yield");
                Thread.yield();
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new ReaderThread().start();
        Thread.sleep(1000);
        number = 42;
        ready = true;
    }
}
