package DesignPatterns.CreationalPatterns.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("HashCode for Singleton1 is :: "+ singleton1.hashCode());
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("HashCode for Singleton2 is :: "+ singleton2.hashCode());
        Singleton singleton3 = Singleton.getInstance();
        System.out.println("HashCode for Singleton3 is :: "+ singleton3.hashCode());
    }
}
