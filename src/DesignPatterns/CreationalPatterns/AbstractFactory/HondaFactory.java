package DesignPatterns.CreationalPatterns.AbstractFactory;

public class HondaFactory implements VehicleFactory{
    @Override
    public Vehicle createCar() {
        return new HondaCar();
    }

    @Override
    public Vehicle createBike() {
        return new HondaBike();
    }
}
