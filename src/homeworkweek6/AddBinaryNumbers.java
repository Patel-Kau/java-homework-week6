package homeworkweek6;

import java.util.Scanner;

/**
 * This program is to add two binary numbers
 */
public class AddBinaryNumbers {
    public static void main(String[] args) {                    // Main Method
        Scanner read = new Scanner(System.in);                  // Scanner object activated
        System.out.print("Enter the First Binary Number : ");   // Display to take first binary input from user
        String a = read.next();                                 // Store the first binary number input in variable
        System.out.print("Enter the Second Binary Number : ");  // Display to take second binary input from user
        String b = read.next();                                 // Store the second binary number input in variable
        AddBinaryNumbers obj = new AddBinaryNumbers();          // create object to call Instance calculation method
        obj.Calculation(a, b);                                  // Call instance calculation method
        read.close();                                           // stop the scanner
    }
    public void Calculation(String a, String b) {                // Create instance calculation method
        int a1 = Integer.parseInt(a, 2);                    // First binary string input convert store in to Integer variable
        int b1 = Integer.parseInt(b, 2);                    // Second binary string input convert store in to Integer variable
        int add = a1 + b1;                                       //  Addition of two Integer variables
        System.out.println("Addition of Two Binary number is : " + Integer.toBinaryString(add));  // Convert integer result in to binary and displayed
    }
}
