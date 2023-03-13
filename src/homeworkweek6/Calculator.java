package homeworkweek6;

import java.util.Scanner;

/**
 * Calculator with addition, subtraction, multiplication, and division methods
 *
 */
public class Calculator {
    public static void main(String[] args) {        // Main Method
        Scanner read = new Scanner(System.in);      // Scanner object activated
        System.out.print("Enter First Value : ");   // Display to take first input from user
        double a = read.nextDouble();               // Store the first input in variable
        System.out.print("Enter Second value : ");  // Display to take second input from user
        double b = read.nextDouble();               // Store the second input in variable
        addition(a, b);                             // Call Addition method
        subtraction(a, b);                          // Call Subtraction Method
        Calculator obj = new Calculator();          // Create object to call Instance method
        obj.multiplication(a, b);                   // Call Multiplication method
        obj.division(a,b);                          // CAll Division Method
        read.close();                               // Stop the Scanner
    }
    public static void addition(double a, double b) {                   // Create static method for addition Calculation
        double addition = a + b;                                        // Calculation
        System.out.println("Addition of Two numbers : " + addition);    // Display the addition result
    }
    public static void subtraction(double a, double b) {                // Create the static method for Subtraction calculation
        double sub = a - b;                                             // Calculation
        System.out.println("Subtraction of two numbers : " + sub);      // Display the Subtraction result
    }

    public void multiplication(double a, double b) {                    // Create Instance method for Multiplication calculation
        double multiplication = a * b;                                  // Calculation
        System.out.println("Multiplication of Two numbers : " + multiplication);    // Display the Multiplication result
    }

    public void division(double a, double b) {                          // Create the Instance method for division calculation
        double division = a / b;                                        // Division calculation
        System.out.println("Division of two numbers :" + division);     // Display the division calculation
    }

}
