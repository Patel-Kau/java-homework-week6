package homeworkweek6;

import java.util.Scanner;

/**
 * This is the program to convert the Uppercase word to lowercase
 */
public class ConvertUpperToLowerCase {

    public static void main(String[] args) {                            // Main method
        Scanner read = new Scanner(System.in);                          // Scanner object activated
        System.out.print("Enter your Name in Uppercase : ");            // Display to take input from user
        String a = read.next();                                         // Store the user input value in variable
        convert(a);                                                     // Call the static method convert
        read.close();                                                   // Close the scanner
    }

    public static void convert(String a) {                                  // Create the static method
        System.out.println("Output in lowercase : " + a.toLowerCase());     // Display the result
    }
}
