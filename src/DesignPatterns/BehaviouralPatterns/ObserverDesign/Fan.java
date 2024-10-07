package DesignPatterns.BehaviouralPatterns.ObserverDesign;

public class Fan implements Observer{
    @Override
    public void update(float temperature) {
        System.out.println("Temperature for the Fan too operate on is: "+ temperature);
    }
}