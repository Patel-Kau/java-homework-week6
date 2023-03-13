package homeworkweek6;

import java.util.Scanner;

/**
 * This program is to convert the decimal number to binary number
 */
public class DecimatToBinary {

    public static void main(String[] args) {                    // Main method

        Scanner read = new Scanner(System.in);                  // Scanner object activated
        System.out.print("Enter the Decimal Number : ");        // Display to take Decimal number input from user
        int d = read.nextInt();                                 // Store the user input value in variable
        calculation(d);                                         // Call static method (calculation) in main method

    }

    public static void calculation(int d) {                     // Create static method for calculation

        System.out.println("Decimal to Binary conversion : " + Integer.toBinaryString(d));  // Display the result in Binary number

    }
}
