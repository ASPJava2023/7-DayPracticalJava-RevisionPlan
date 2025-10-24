package Day4.exceptionHandling;

import java.util.Scanner;

public class ExceptionHierarchy {
    public static void main (String ... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any name: ");
        String name = sc.next();
        try{
             System.out.println(name.length());
        }
        catch (NullPointerException e){
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
        catch (Exception e){
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
