package DesignPatterns.CreationalPatterns.AbstractFactory;

public class HondaCar implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a Honda car...");
    }
}
