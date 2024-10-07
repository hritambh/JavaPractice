package DesignPatterns.ObserverDesign;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAlObservers();
}
