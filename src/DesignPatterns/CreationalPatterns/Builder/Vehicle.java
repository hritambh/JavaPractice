package DesignPatterns.CreationalPatterns.Builder;

public class Vehicle {
    private String engine;
    private int wheels;
    private int seats;
    private boolean hasGPS;

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isHasGPS() {
        return hasGPS;
    }

    public String toString(){
        return "Vehicle [Engine=" + engine + ", Wheels=" + wheels +
                ", Seats=" + seats + ", GPS=" + hasGPS + "]";
    }

    private Vehicle(Builder builder){
        this.engine=builder.engine;
        this.wheels=builder.wheels;
        this.seats=builder.seats;
        this.hasGPS=builder.hasGPS;
    }

    public static class Builder {
        private String engine;
        private int wheels;
        private int seats;
        private boolean hasGPS;

        public Builder setEngine (String engine){
            this.engine=engine;
            return this;
        }

        public Builder setWheels (int wheels){
            this.wheels=wheels;
            return this;
        }

        public Builder setSeats (int seats){
            this.seats=seats;
            return this;
        }

        public Builder setGPS (boolean engine){
            this.hasGPS = hasGPS;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }
    }
}
