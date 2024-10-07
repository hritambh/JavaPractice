package JavaBasics.OOPS.Basics.Classes;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Hritambh",23);
        person1.introduce();
        person1.setName("Stew");
        person1.setAge(25);
        person1.introduce();
    }
}
