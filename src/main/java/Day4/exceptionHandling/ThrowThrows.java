package Day4.exceptionHandling;

import java.util.Scanner;

public class ThrowThrows {
    static void validMarks(int marks) throws Exception {
        if (marks > 0 && marks < 40) {
            throw new Exception("Fail marks: " + marks);
        } else {
            System.out.println("Pass marks: " + marks);
        }
    }

    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks:");
        int marks = sc.nextInt();
         validMarks(marks);
        }
          catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
