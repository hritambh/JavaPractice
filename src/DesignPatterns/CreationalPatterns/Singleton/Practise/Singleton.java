package DesignPatterns.CreationalPatterns.Singleton.Practise;

public class Singleton {
    private static Singleton single_singleton = null;
    private String s = "I'm the first instance";

    private Singleton() {
        System.out.println(s);
    }

    public static synchronized Singleton getInstance(){
        if (single_singleton==null)
            single_singleton = new Singleton();
        return single_singleton;
    }
}
