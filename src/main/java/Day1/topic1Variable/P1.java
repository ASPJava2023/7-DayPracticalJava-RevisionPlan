package Day1.topic1Variable;

public class P1 {
    public static void main(String[] args) {
        /*Variable Declaration and Initialization*/
        int marks;/*Variable Declaration*/
        marks = 90;//Initialization
        System.out.println("Marks: " + marks);
        /*Multiple Variable Declaration*/
        int a = 10, b = 20, c = 30;
        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
        System.out.println("Sum: " + (a + b + c));
        //Variable Reassignment
        marks = 95; //Reassignment
        System.out.println("Updated Marks: " + marks);
        //Constant Variable
        final double pi = 3.14159;
        System.out.println("Value of pi: " + pi);
        //pi = 3.14; // This will cause a compile-time error
        System.out.println("The new value of pi" + pi);
        //String Concatenation Using Variables
        String firstName = "John";
        String lastName = "Doe";
        System.out.println("Full Name :"+firstName+" "+lastName);
    }
}
