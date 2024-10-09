package DesignPatterns.BehaviouralPatterns.ObserverDesign.Practise;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Display dis1 = new Display();
        Display dis2 = new Display();
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        weatherStation.registerOberver(dis1);
        weatherStation.registerOberver(dis2);
        weatherStation.registerOberver(fan1);
        weatherStation.registerOberver(fan2);

        weatherStation.setTemperature(23.5F);

    }
}
