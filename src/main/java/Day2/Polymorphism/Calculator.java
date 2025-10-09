package Day2.Polymorphism;

//Method Overloading

public class Calculator {
    int add(int... a) {
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        return sum;

    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of integers: " + calc.add(5, 10, 15));
        System.out.println("Sum of doubles: " + calc.add(5.5, 10.2));
    }
}
