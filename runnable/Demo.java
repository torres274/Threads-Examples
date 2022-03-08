package com.threads.examples.runnable;

public class Demo implements Runnable {
    @Override
    public void run() {
        try {
            System.out.printf("This code is running in a thread %s%n", Thread.currentThread().getName());
        }catch (Exception e) {
            System.out.printf("Error running thread %s%n", e.getMessage());
        }

    }
}
