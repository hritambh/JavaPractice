package DesignPatterns.CreationalPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        Vehicle economyCar = new Vehicle.Builder()
                .setEngine("1.2L")
                .setSeats(5)
                .setWheels(4)
                .setGPS(false)
                .build();

        Vehicle sportsCar = new Vehicle.Builder()
                .setEngine("4.2L")
                .setSeats(2)
                .setWheels(4)
                .setGPS(true)
                .build();

        System.out.println(economyCar);
        System.out.println(sportsCar);
    }
}
