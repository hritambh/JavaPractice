package DesignPatterns.CreationalPatterns.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory toyotaFactory = new ToyotaFactory();
        Vehicle toyotaCar = toyotaFactory.createCar();
        Vehicle toyotaBike = toyotaFactory.createBike();

        VehicleFactory hondaFactory = new HondaFactory();
        Vehicle hondaCar = hondaFactory.createCar();
        Vehicle hondaBike = hondaFactory.createBike();

        toyotaCar.drive();
        toyotaBike.drive();
        hondaCar.drive();
        hondaBike.drive();
    }
}
