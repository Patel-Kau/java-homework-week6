package homeworkweek6;

import java.util.Scanner;

/**
 *  This program is for Multiplication table
 */
public class MultiplicationTable {

    public static void main(String[] args) {                                // Main method
        Scanner read = new Scanner(System.in);                              // Scanner object activated
        System.out.println("Enter the Multiplication Table  number : ");    // Display to take number input from user
        int a = read.nextInt();                                             // Store the input in variable
        MultiplicationTable obj = new MultiplicationTable();                // Create object to call Instance method
        obj.table(a);                                                       // Call table Instance method
        read.close();                                                       // Scanner closed
    }
     public void table(int a){                                              // Create Instance method
         System.out.println(a + " X 1  = "+ (a*1));                         // Calculation and Display the result
         System.out.println(a + " X 2  = "+ (a*2));                         // Calculation and Display the result
         System.out.println(a + " X 3  = "+ (a*3));                         // Calculation and Display the result
         System.out.println(a + " X 4  = "+ (a*4));                         // Calculation and Display the result
         System.out.println(a + " X 5  = "+ (a*5));                         // Calculation and Display the result
         System.out.println(a + " X 6  = "+ (a*6));                         // Calculation and Display the result
         System.out.println(a + " X 7  = "+ (a*7));                         // Calculation and Display the result
         System.out.println(a + " X 8  = "+ (a*8));                         // Calculation and Display the result
         System.out.println(a + " X 9  = "+ (a*9));                         // Calculation and Display the result
         System.out.println(a + " X 10 = "+(a*10));                         // Calculation and Display the result

     }
}




