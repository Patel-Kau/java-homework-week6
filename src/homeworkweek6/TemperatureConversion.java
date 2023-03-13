package homeworkweek6;

import java.util.Scanner;
/**
 * This program is for to convert the temperature from degree Fahrenheit to degree Celsius
 */
public class TemperatureConversion {
    public static void main(String[] args) {                                // Main method
       temperature();                                                       // Call Static method temperature
    }

    public static void temperature() {                                          // Create static method
        System.out.println("Enter the Temperature in Degree Fahrenheit : ");    // Display to take Temperature in Degree Fahrenheit input from user
        Scanner read = new Scanner(System.in);                                  // Scanner object activated
        double f = read.nextInt();                                              // Store the temperature input in variable
        Double temp = ((f - 32) * 5 / 9);                                       // Conversion calculation formula
        System.out.println("Temperature in Degree Celsius : " + temp);          // Display the result
        read.close();                                                           // Scanner closed
    }
}
