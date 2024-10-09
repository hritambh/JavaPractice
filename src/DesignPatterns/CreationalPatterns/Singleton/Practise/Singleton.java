package DesignPatterns.CreationalPatterns.Singleton.Practise;

public class Singleton {
    private static Singleton single_singleton;
    private String s= "I'm the first Instance";
    private Singleton(){
        System.out.println(s);
    }

/* the synchronized keyword in the getInstance() method of the Singleton class is to ensure
   thread safety. In a multithreaded environment, without synchronization, multiple threads
    could potentially enter the getInstance() method simultaneously and create
    multiple instances of the Singleton class, violating the singleton pattern's
    guarantee of having only one instance. */

    public static synchronized Singleton getInstance(){
        if (single_singleton==null)
            single_singleton = new Singleton();
        return single_singleton;
    }
}
