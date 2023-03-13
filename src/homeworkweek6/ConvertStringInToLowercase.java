package homeworkweek6;

import java.util.Scanner;

/**
 * This program is to convert the Uppercase string to Lowercase
 */
public class ConvertStringInToLowercase {
    public static void main(String[] args) {                                    // Main method

        Scanner read = new Scanner(System.in);                                  // Scanner object activated
        System.out.print("Enter your Name in Uppercase : ");                    // Display to take input from user
        String a = read.nextLine();                                             // Store the user input value in variable
        ConvertStringInToLowercase obj = new ConvertStringInToLowercase();      // Create object to call Instance method
        obj.convert(a);                                                         // Call the Instance method of convert
        read.close();                                                           // Stop the Scanner
    }

    public void convert(String a) {                                              // Create Instance method
        System.out.println("Result in Lowercase : " + a.toLowerCase());          // Display the result
    }
}
