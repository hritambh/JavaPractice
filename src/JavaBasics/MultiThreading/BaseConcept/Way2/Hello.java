package JavaBasics.MultiThreading.BaseConcept.Way2;

import JavaBasics.MultiThreading.BaseConcept.Way1.World;

public class Hello {
    public static void main(String[] args) {
        World w1 = new World();
        Thread t1 = new Thread(w1);
        t1.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello -----------------> "+ Thread.currentThread().getName() );
        }
    }
}
