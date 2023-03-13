package homeworkweek6;

import java.util.Scanner;

/**
 * This program is for calculation of Addition, Subtraction, Multiplication, Division and remainder of two number
 */
public class MultipalCalculation {

    public static void main(String[] args) {                // Main method
        Scanner read = new Scanner(System.in);              // Scanner object activated
        System.out.print("Input first number : ");          // Display to take first input from user
        double x = read.nextDouble();                       // Store the first input in variable
        System.out.print("Input second number : ");         // Display to take second input from user
        double y = read.nextDouble();                       // Store the second input in variable
       MultipalCalculation obj = new MultipalCalculation(); // Create object to call Instance method
        System.out.println("");                             // Blank line display
        System.out.println("Calculation Results:-");        // Display message
        obj.addition(x,y);                                  // Call Instance method
        obj.subtraction(x,y);                               // Call Instance method
        multiplication(x,y);                                // Call Static method
        division(x,y);                                      // Call Static method
        remainder(x, y);                                    // Call static method
        read.close();                                       // Stop the Scanner
    }

    public void addition(double x, double y) {                      // Create Instance method
        double ans = x + y;                                         // Addition Calculation
        System.out.println("Addition of Two numbers : " + ans);     // Display the result
    }

    public void subtraction(double x, double y) {                   // Create Instance method
        double ans = x - y;                                         // Subtraction Calculation
        System.out.println("Subtraction of Two numbers : " + ans);  // Display the result
    }

    public static void multiplication(double x, double y) {             // Create static method
        double ans = x * y;                                             // Multiplication Calculation
        System.out.println("Multiplication of Two numbers : " + ans);   // Display the result
    }

    public static void division(double x, double y) {                   // Create static method
       double ans = x / y;                                             // Division Calculation
        System.out.println("Division of Two numbers : " + ans);         // Display the result
    }

    public static void remainder(double x, double y) {                   // Create static method
        double ans = x % y;                                             // Remainder Calculation
        System.out.println("Remainder of Two numbers : " + ans);         // Display the result
    }

}
