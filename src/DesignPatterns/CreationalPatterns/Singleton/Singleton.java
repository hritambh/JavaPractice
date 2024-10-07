package DesignPatterns.CreationalPatterns.Singleton;

public class Singleton {
    private static Singleton single_singleton = null;
    private String s ;
    private Singleton() {
        s= "I'm the first Instance";
        System.out.println("I'm the first Instance");
    }
    public static synchronized Singleton getInstance() {
        if (single_singleton== null){
            single_singleton = new Singleton();
        }
        return single_singleton;
    }
}
