package DesignPatterns.CreationalPatterns.AbstractFactory;

public class HondaBike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a Honda bike...");
    }
}
