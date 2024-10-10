package JavaBasics.MultiThreading.BaseConcept.Way1;

public class World extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("World -----------------> "+ Thread.currentThread().getName());
        }
    }
}
