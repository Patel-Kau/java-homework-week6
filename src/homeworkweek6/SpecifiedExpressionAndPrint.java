package homeworkweek6;

/**
 * This  Java program to compute the specified expressions and print the output
 */
public class SpecifiedExpressionAndPrint {

    public static void main(String[] args) {                                        // Main method
        SpecifiedExpressionAndPrint obj = new SpecifiedExpressionAndPrint();        // Create object to call Instance method
        obj.calculation();                                                          // Call Instance method
    }
    public void calculation() {                                                     // Create Instance method
        double answer = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));                  // Calculation
        System.out.println("Excepted Output : " + answer);                          // Display the result

    }

}
