package DesignPatterns.CreationalPatterns.FactoryPattern.FactoryPattern1;

public class HRPortal {
    public static void main(String[] args) {
        Employee orgf = OrgFactory.getEmployee("Android");
        System.out.println(orgf.salary());
        Employee orgf1 = OrgFactory.getEmployee("Web");
        System.out.println(orgf1.salary());
    }
}
