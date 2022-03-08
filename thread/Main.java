package com.threads.examples.thread;


public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.start();
        System.out.println("This code is outside of the thread");
    }
}
