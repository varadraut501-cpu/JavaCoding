package JavaCoding;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        // Swapping without third variable
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        
        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        
        sc.close();
    }
}
