package DesignPatterns.StructuralPatterns.FacadePattern;

public class DVDPlayer {
    public void on(){
        System.out.println("DVD Player is On.");
    }
    public void play(String movie){
        System.out.println("Playing Movie :: "+ movie);
    }
    public void off(){
        System.out.println("DVD Player is Off.");
    }
}
