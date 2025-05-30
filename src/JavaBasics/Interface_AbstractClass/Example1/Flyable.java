package JavaBasics.Interface_AbstractClass.Example1;

interface Flyable {
    void fly(); // implicitly public abstract

    default void checkWings() {
        System.out.println("Checking wings");
    }
}

