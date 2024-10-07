package DesignPatterns.StructuralPatterns.FacadePattern;

public class SoundSystem {
    public void on(){
        System.out.println("Sound System is On.");
    }
    public void off(){
        System.out.println("Sound System is Off.");
    }
    public void setVolume(int level){
        System.out.println("Setting volume to :: "+ level);
    }
}
