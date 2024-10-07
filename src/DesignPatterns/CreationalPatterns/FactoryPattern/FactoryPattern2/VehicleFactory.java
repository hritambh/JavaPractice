package DesignPatterns.CreationalPatterns.FactoryPattern.FactoryPattern2;

public class VehicleFactory {
    public static Vehicle createVehicle(String vehicleType){
        if (vehicleType == null) {
            return null;
        }
        switch (vehicleType.toLowerCase()) {
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            case "truck":
                return new Truck();
            default:
                throw new IllegalArgumentException("Unknown vehicle type");
        }
    }
}
