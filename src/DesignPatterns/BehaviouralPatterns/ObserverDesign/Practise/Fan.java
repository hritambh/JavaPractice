package DesignPatterns.BehaviouralPatterns.ObserverDesign.Practise;

public class Fan implements Observer{
    @Override
    public void update(float temp) {
        System.out.println("Tempratue at Fan :: "+ temp);
    }
}
