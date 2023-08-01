package org.example.programowanieWspolbiezneRownolegle.zadanie4;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(10000);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    account.pay(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account.transfer(5000);
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account.transfer(5000);
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
