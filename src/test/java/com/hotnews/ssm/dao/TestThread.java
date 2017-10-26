package com.hotnews.ssm.dao;

/**
 * Created by AnonymousH on 2017/10/20.
 */
public class TestThread implements Runnable{

    int b = 100;

    synchronized void m1() throws InterruptedException {
        b = 1000;
        Thread.sleep(500);
        System.out.println("b=" + b);
    }

    synchronized void m2() throws InterruptedException {
        Thread.sleep(250);
        b = 2000;
    }

    public static void main(String[] args) throws InterruptedException {
        TestThread tt = new TestThread();
        Thread t = new Thread(tt);
        t.start();

        tt.m2();
        System.out.println("main thread b=" + tt.b);
    }

    public void run() {
        try {
            m1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
