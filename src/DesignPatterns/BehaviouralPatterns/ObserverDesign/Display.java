package DesignPatterns.BehaviouralPatterns.ObserverDesign;

public class Display implements Observer{
    @Override
    public void update(float temperature) {
        System.out.println("Temperature of the Display is: "+ temperature);
    }
}
