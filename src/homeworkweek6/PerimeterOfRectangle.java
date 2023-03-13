package homeworkweek6;

import java.util.Scanner;

/**
 * This program is for Rectangle perimeter calculation
 */
public class PerimeterOfRectangle {
    public static void main(String[] args) {                            // Main method
        Scanner read = new Scanner(System.in);                          // Scanner object activated
        System.out.print("Enter the Height of the Rectangle : ");       // Display to take Height of the Rectangle input from user
        double h = read.nextDouble();                                   // Store the Height input in variable
        System.out.print("Enter the Width of the Rectangle : ");        // Display to take Width of the Rectangle input from user
        double w = read.nextDouble();                                   // Store the Width input in variable
        PerimeterOfRectangle obj = new PerimeterOfRectangle();          // Create object to call Instance method
        obj.areacalculation(h, w);                                      // Call Instance method of Area calculation
        perimetercal(h, w);                                             // Call static method of Perimeter calculation
        read.close();                                                   // Scanner closed
    }
    public void areacalculation(double h, double w) {                   // Create Instance method

        double a = h * w;                                               // Calculation
        System.out.println("Total Area of rectangle is : " + a);        // Display the result
    }
    public static void perimetercal(double h, double w) {               //  Create static method
        double p = 2 * (h + w);                                         // Calculation
        System.out.println("Total Area of rectangle is : " + p);        // Display the result
    }
}
