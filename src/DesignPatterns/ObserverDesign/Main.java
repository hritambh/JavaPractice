package DesignPatterns.ObserverDesign;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Display tv = new Display();
        Fan bajaj = new Fan();

        weatherStation.registerObserver(tv);
        weatherStation.registerObserver(bajaj);

        tv.update(34);
        tv.update(45);
        bajaj.update(34);
        bajaj.update(45);
    }
}
