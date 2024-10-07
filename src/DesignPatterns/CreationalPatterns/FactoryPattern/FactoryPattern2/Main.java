package DesignPatterns.CreationalPatterns.FactoryPattern.FactoryPattern2;

public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle("Car");
        car.drive();

        Vehicle bike = VehicleFactory.createVehicle("Bike");
        bike.drive();

        Vehicle truck = VehicleFactory.createVehicle("Truck");
        truck.drive();
    }
}
