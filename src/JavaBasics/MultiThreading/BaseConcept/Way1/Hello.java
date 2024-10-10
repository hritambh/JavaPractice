package JavaBasics.MultiThreading.BaseConcept.Way1;

public class Hello {
    public static void main(String[] args) {

        World w1 = new World();
        w1.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello -----------------> "+ Thread.currentThread().getName() );
        }
    }
}
