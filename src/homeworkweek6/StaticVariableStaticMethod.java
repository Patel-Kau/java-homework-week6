package homeworkweek6;

/**
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class StaticVariableStaticMethod {

    static int x = 13;          //Static Variable
    static int y =7;            //Static Variable

    public static void main(String[] args) {
        myMethod();                                     //Call the static method into the Main method
    }


    public static void myMethod(){                      // Create static method
        System.out.println("Static Method");            // Print "Static Method"
        System.out.println(x);                          //call static variable x
        System.out.println(y);                          //call static variable y
    }


}
