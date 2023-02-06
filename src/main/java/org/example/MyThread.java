package org.example;

public class MyThread extends Thread{
    int numberThread;

    public MyThread (int numberThread){
        this.numberThread = numberThread;
    }

    @Override
    public void run() {
        while (true){
            System.out.println(numberThread);
        }
    }
}
