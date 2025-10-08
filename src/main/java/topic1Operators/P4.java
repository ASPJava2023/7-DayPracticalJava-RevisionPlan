package topic1Operators;

public class P4 {
    public static void main(String[] args) {
        /*        Write a program that checks if a number is divisible by both 3 and 5 using logical operators.*/
        int number = 16;
        boolean isDivisibleBy3 = (number % 3 == 0);
        boolean isDivisibleBy5 = (number % 5 == 0);
        if (isDivisibleBy3 && isDivisibleBy5) {
            System.out.println(number + " is divisible by both 3 and 5.");
        } else {
            System.out.println(number + " is not divisible by both 3 and 5.");
        }
    }
}
