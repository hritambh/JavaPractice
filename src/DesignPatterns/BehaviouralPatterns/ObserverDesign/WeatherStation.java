package DesignPatterns.BehaviouralPatterns.ObserverDesign;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private List<Observer> Observers;

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    private float temperature;

    public WeatherStation(){
        Observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        Observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        Observers.remove(observer);
    }

    @Override
    public void notifyAlObservers() {
        for (Observer observer:Observers){
            observer.update(temperature);
        }
    }
}
