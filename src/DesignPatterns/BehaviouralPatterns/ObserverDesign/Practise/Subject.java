package DesignPatterns.BehaviouralPatterns.ObserverDesign.Practise;

public interface Subject {
    public void registerOberver(Observer observer);
    public void removeOberver(Observer observer);
    public void notifyObservers();
}
