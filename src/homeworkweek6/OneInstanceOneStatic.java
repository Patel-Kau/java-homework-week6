package homeworkweek6;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class OneInstanceOneStatic {

    int x = 4;                  // Declare Instance Variable.
    static int y = 26;          // Declare Static Variable.

    public static void main(String[] args) {
        myMethod();                                                  // Call Static method in main method.
        OneInstanceOneStatic obj = new OneInstanceOneStatic();       // Declare object to call Instance to static method.
        obj.Instancemethod();                                        // Call Instance method in main method.

    }

    public static void myMethod() {                                 // Create Static Method.
        OneInstanceOneStatic obj = new OneInstanceOneStatic();      // Declare object to call Instance method  to static Variable.
        System.out.println("Static Method");                        // Print "Static Method"
        System.out.println(obj.x);                                  // Call Instance Variable.
        System.out.println(y);                                      // Call Static Variable.
    }

    public void Instancemethod() {                                  // Create Instance Method.
        System.out.println("INSTANCE METHOD");                      // Print "Instance Method"
        System.out.println(x);                                      // Call Instance Variable.
        System.out.println(y);                                      // Call Static Variable.
    }

}
