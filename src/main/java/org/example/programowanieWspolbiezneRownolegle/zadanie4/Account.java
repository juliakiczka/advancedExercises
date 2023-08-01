package org.example.programowanieWspolbiezneRownolegle.zadanie4;

public class Account {
    private float saldo;

    public Account(float saldo) {
        this.saldo = saldo;
    }

    synchronized void transfer(float amount) {
        saldo += amount;
        notify();
        System.out.printf("Transfering %f, saldo: %f%n", amount, saldo);
    }

    synchronized void pay(float amount) throws InterruptedException {
        while (amount > saldo) {
            System.out.println("Not enough money! Waiting...");
            wait();
        }
        saldo -= amount;
        System.out.printf("Paying %f, saldo: %f%n", amount, saldo);
    }
}
