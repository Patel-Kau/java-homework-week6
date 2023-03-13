package homeworkweek6;

/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 *      print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme
 */

public class TwoInstanceTwoStaticVariable {

    int a = 34;             // Declare Instance Variable.
    int s = 22;             // Declare Instance Variable.
    static int d = 33;      // Declare Static Variable.
    static int f = 44;      // Declare Static Variable.

    public static void main(String[] args) {
      staticmethod();                                                           // Called Static Method
      TwoInstanceTwoStaticVariable obj = new TwoInstanceTwoStaticVariable();    // Declare object to call Instance method
      obj.Instancemethod();                                                     // Call Instance method
    }
public void Instancemethod(){                                       // Create Instance method
    System.out.println("Instance Method");                          // Display message
    System.out.println(a);                                          // Called Instance variable
    System.out.println(s);                                          // Called Instance variable
    System.out.println(d);                                          // Called Static variable
    System.out.println(f);                                          // Called Static variable
}
public static void staticmethod(){                                              // Create static method
    System.out.println("Static Method");                                        // Display message
    TwoInstanceTwoStaticVariable obj = new TwoInstanceTwoStaticVariable();      // Create object to call instance variable
    System.out.println(obj.a);                                                  // Called Instance variable
    System.out.println(obj.s);                                                  // Called Instance variable
    System.out.println(d);                                                      // Called Static variable
    System.out.println(f);                                                      // Called Static variable
}
}
