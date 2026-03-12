package JavaCoding;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        
        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Input length
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        
        // Input width
        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();
        
        // Calculate area
        double area = length * width;
        
        // Display result
        System.out.println("Area of rectangle is: " + area);
        
        // Close scanner
        sc.close();
    }
}
