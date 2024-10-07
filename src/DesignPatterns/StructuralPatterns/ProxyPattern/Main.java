package DesignPatterns.StructuralPatterns.ProxyPattern;

public class Main {
    public static void main(String[] args) {
        ProxyImage image1 = new ProxyImage("img1.jpg");
        ProxyImage image2 = new ProxyImage("img2.jpg");
        image1.display();
        image1.display();
        image2.display();
    }
}
