package JavaBasics.Basics;

import java.util.Scanner;

public class ConvertToBinary {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int decNumber = sc.nextInt();
        System.out.print("The binary equivalent is :: ");
        System.out.println(converttoBinary(decNumber));
    }

    private static StringBuilder converttoBinary(int decNumber) {
        if (decNumber == 0)
            return new StringBuilder("0");
        StringBuilder binary = new StringBuilder();
        while (decNumber>0){
            int remainder = decNumber%2;
            binary.append(remainder);
            decNumber /= 2;
        }
        return binary.reverse();
    }
}
