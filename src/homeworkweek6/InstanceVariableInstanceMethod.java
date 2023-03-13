package homeworkweek6;
/**
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class InstanceVariableInstanceMethod {
    int x = 25;     // Declaration of Instance variable
    int y = 4;      // Declaration of Instance variable

    public static void main(String[] args) {                                        // Main method
        InstanceVariableInstanceMethod a = new InstanceVariableInstanceMethod();    // Create object to call Instance method
        a.myMethod();                                                               // Call instance method in Main method
    }
    public void myMethod() {                                     // Create instance method
        System.out.println("My Instance Variable ");             // Display message
        System.out.println(x);                                   // Call instance variables into the instance method inside the print statement.
        System.out.println(y);                                   // Call instance variables into the instance method inside the print statement.

    }
}
