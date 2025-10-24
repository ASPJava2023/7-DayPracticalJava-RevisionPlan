package Day4.exceptionHandling;

import java.util.Scanner;

public class NestedTry {
    public static void main(String ...args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        try{
            try{
                System.out.println("Inside first try block");
                int a = 10/number; // This will cause ArithmeticException
            } catch(ArithmeticException e){
                System.out.println("Caught ArithmeticException: " + e.getMessage());
            }
            String s = null;
            System.out.println(s.length()); // This will cause NullPointerException
        } catch(NullPointerException e){
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
