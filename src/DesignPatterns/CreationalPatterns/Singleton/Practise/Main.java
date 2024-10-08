package DesignPatterns.CreationalPatterns.Singleton.Practise;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcom to the singleton class");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        System.out.println(instance3.hashCode());
    }
}
