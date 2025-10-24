package Day4.exceptionHandling;

import java.util.Scanner;

public class MultipleCatch {
    public static void main(String ... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array index :");
        int i= sc.nextInt();
        System.out.println("Enter  divisor:");
        int b= sc.nextInt();
        try(sc) {
            int[] arr = {1, 2, 3};
            System.out.println("The Answer of division is " +arr[i] / b);
        }
        catch (ArithmeticException e){
             System.out.println("Arithmetic Exception: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception: " + e.getMessage());
        }
       }
}

