package DesignPatterns.StructuralPatterns.ProxyPattern;

import java.util.HashMap;
import java.util.Map;

public class ProxyImage implements Image{
    private String filename;
    private static Map<String, RealImage> imageCache = new HashMap<>();

    public ProxyImage(String filename){
        this.filename=filename;
    }

    @Override
    public void display() {
        RealImage realImage = imageCache.get(filename);
        if (realImage == null) {
            realImage = new RealImage(filename);
            imageCache.put(filename, realImage);
        }
        realImage.display();
    }
}
