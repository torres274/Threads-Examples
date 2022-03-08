package com.threads.examples.thread;

public class Demo extends Thread {
    public void run() {
        try {
            System.out.printf("This code is running in a thread: %s%n", Thread.currentThread().getName());
        }catch (Exception e) {
            System.out.printf("Error running thread: %s%n", e.getMessage());
        }
    }
}
