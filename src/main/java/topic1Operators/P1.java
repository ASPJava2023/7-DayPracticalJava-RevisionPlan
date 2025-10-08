package topic1Operators;

public class P1 {
    public static void main(String[] args) {
        //Arithmetic Operators
        double a = 10; double b = 4;
        System.out.println("a + b = " + (a + b)); //Addition
        System.out.println("a - b = " + (a - b)); //Subtraction
        System.out.println("a * b = " + (a * b)); //Multiplication
        System.out.println("a / b = " + (a / b)); //Division
        System.out.println("a % b = " + (a % b)); //Modulus

        /*Relational Operators*/
        System.out.println("a > b: " + (a > b)); //Greater than
        System.out.println("a < b: " + (a < b)); //Less than
        System.out.println("a >= b: " + (a >= b)); //Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); //Less than or equal to
        System.out.println("a == b: " + (a == b)); //Equal to
        System.out.println("a != b: " + (a != b)); //Not equal to
        //Logical Operators
        boolean x = true; boolean y = false;
        System.out.println("x && y: " + (x && y)); //Logical AND
        System.out.println("x || y: " + (x || y)); //Logical OR
        System.out.println("!x: " + (!x)); //Logical NOT
    }

}
