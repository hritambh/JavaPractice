package DesignPatterns.BehaviouralPatterns.ObserverDesign.Practise;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private List<Observer> Observers;
    private float temperature;

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public WeatherStation(){
        Observers = new ArrayList<>();
    }
    @Override
    public void registerOberver(Observer observer) {
        Observers.add(observer);
    }

    @Override
    public void removeOberver(Observer observer) {
        Observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: Observers){
            observer.update(temperature);
        }
    }
}
