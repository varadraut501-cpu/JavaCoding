package JavaCoding;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Input principal amount
        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();
        
        // Input rate of interest
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        
        // Input time (in years)
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();
        
        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;
        
        // Display result
        System.out.println("Simple Interest is: " + simpleInterest);
        
        sc.close();
    }
}
