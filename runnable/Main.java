package com.threads.examples.runnable;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Demo());
        thread.start();
        System.out.println("This code is outside of the thread");
    }


}
