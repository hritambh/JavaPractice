package JavaBasics.MultiThreading.BaseConcept.Way2;

public class World implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("World -----------------> "+ Thread.currentThread().getName());
        }
    }
}
