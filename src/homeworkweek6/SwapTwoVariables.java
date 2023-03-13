package homeworkweek6;

import java.util.Scanner;

/**
 * This program is to swap two variables
 */
public class SwapTwoVariables {
    public static void main(String[] args) {                    // Main method

        Scanner read = new Scanner(System.in);                  // Scanner object activated
        System.out.println("Enter the 1st Variable A : ");      // Display to take First variable input from user
        int a = read.nextInt();                                 // Store the First variable input in variable
        System.out.println("Enter the 2nd Variable B : ");      // Display to take Second variable input from user
        int b = read.nextInt();                                 // Store the Second variable input in variable
        swap(a, b);                                             // Call static method
        read.close();                                           // Scanner closed
    }
    public static void swap(int a, int b) {                         // Create static method
        System.out.println("Original value of both Variable");      // Display message
        System.out.println("1st Variables =" + a);                  // First Variable value display
        System.out.println("2nd Variables =" + b);                  // Second Variable value display
        a = a ^ b ^ (b = a);                                        // Swap variables formula
        System.out.println("Swap value of both Variable");          // Display message
        System.out.println("1st Variables =" + a);                  // First Variable value display after swapped
        System.out.println("2nd Variables =" + b);                  // Second Variable value display after swapped
    }
}
