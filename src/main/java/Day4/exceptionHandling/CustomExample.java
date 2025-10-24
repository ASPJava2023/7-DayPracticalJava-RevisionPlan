package Day4.exceptionHandling;

import java.util.Scanner;

public class CustomExample {
    public static void main(String... args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        try (sc) {
            if (age < 18) {
                throw new InvalidAgeException("Age is not valid to vote");
            } else {
                System.out.println("You are eligible to vote");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
