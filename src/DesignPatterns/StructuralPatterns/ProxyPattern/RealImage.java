package DesignPatterns.StructuralPatterns.ProxyPattern;

public class RealImage implements Image{
    private String filename;

    public RealImage(String filename){
        this.filename=filename;
        loadImageFromDisk();
    }

    public void loadImageFromDisk(){
        System.out.println("Loading..." + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }
}
