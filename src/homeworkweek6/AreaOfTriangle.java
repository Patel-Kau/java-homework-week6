package homeworkweek6;

import java.util.Scanner;

/**
 * This program is for Area calculation of Triangle
 */
public class AreaOfTriangle {
    public static void main(String[] args) {                                  // Main method
        Scanner read = new Scanner(System.in);                                // Scanner object activated
        System.out.print("Enter the Triangle Height in Centimeter : ");       // Display to take first input from user
        double h = read.nextInt();                                            // Store the first input in variable
        System.out.print("Enter the Triangle base in Centimeter : ");         // Display to take second input from user
        double b = read.nextInt();                                            // Store the second input in variable
        area(h, b);                                                           // Call area calculation method
        read.close();                                                         // Stop the scanner
    }

    public static void area(double h, double b) {                              // Static method to Area Calculation

        Double area = ((h * b) / 2);                                           // Area calculation
        System.out.println("Total Area of Triangle is : " + area);             // Display the area calculation on screen
    }
}
