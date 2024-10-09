package DesignPatterns.BehaviouralPatterns.ObserverDesign.Practise;

public class Display implements Observer{
    @Override
    public void update(float temperature) {
        System.out.println("Tempratue at Display :: "+ temperature);
    }
}
