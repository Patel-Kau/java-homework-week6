package homeworkweek6;

import java.util.Scanner;

/**
 * Circle area calculation
 */
public class CircleAreaCalculation {
    public static void main(String[] args) {            // Main method
        calculation();                                  // Call Calculation Static method
    }

    public static void calculation() {                          // Create static method for calculation
        System.out.print("Enter Radius : ");                    // Display to take radius input from user
        Scanner read = new Scanner(System.in);                  // Scanner object activated
        double a = read.nextInt();                              // Store the scanned input value in variable
        double ans = (3.14 * a * a);                            // Circle area calculation
        System.out.println("Total Area of circle : " + ans);    // Display the Circle area calculation result
        read.close();                                           // Stop the Scanner
    }
}
