package DesignPatterns.CreationalPatterns.AbstractFactory;

public class ToyotaFactory implements VehicleFactory{
    @Override
    public Vehicle createCar() {
        return new ToyotaCar();
    }

    @Override
    public Vehicle createBike() {
        return new ToyotaBike();
    }
}
