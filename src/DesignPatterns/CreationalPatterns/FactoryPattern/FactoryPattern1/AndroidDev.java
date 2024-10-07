package DesignPatterns.CreationalPatterns.FactoryPattern.FactoryPattern1;

public class AndroidDev implements Employee{
    @Override
    public int salary() {
        System.out.println("Fetching Android Developer's Salary");
        return 50000;
    }
}
