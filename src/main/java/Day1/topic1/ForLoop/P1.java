package Day1.topic1.ForLoop;

public class P1 {
    public static void main(String[] args) {
        int sum = 0;
        int countEven = 0;
        int countOdd = 0;
        for (int i = 1; i <= 14; i++) {

            System.out.println(+i);
            sum = sum + i;
            if (i % 2 == 0) {
                // System.out.println(i+" is even number");
                countEven++;
            } else {
                //System.out.println(i+" is odd number");
                countOdd++;
            }
            System.out.println("Sum is: " + sum);
            System.out.println("Count of even numbers: " + countEven);
            System.out.println("Count of odd numbers: " + countOdd);
        }
    }
}
