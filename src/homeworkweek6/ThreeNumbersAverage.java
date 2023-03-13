package homeworkweek6;

import java.util.Scanner;

/**
 * This program is to calculate the Average valuer of three numbers
 */
public class ThreeNumbersAverage {

    public static void main(String[] args) {                        // Main method
        Scanner read = new Scanner(System.in);                      // Scanner object activated
        System.out.print("Enter the 1st Number : ");                // Display to take first input from user
        double a = read.nextInt();                                  // Store first input into variable
        System.out.print("Enter the 2nd Number : ");                // Display to take second input from user
        double b = read.nextInt();                                  // Store second input into variable
        System.out.print("Enter the 3rd Number : ");                // Display to take third input from user
        double c = read.nextInt();                                  // Store third input into variable
        calculation(a, b, c);                                       // call static method calculation
        read.close();                                               //  Scanner closed
    }
    public static void calculation( double a, double b, double c){              // Create static method
        double answer = ((a+b+c)/3);                                            // Calculation for Average value
        System.out.println("Average Value of given 3 Number is : "+ answer);    // Display the result

    }
}

