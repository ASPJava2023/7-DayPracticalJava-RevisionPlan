package topic.Array;

import java.util.Arrays;

public class P1 {
    public static void main(String[] args) {
        int mark[] = {90, 85, 88};
        System.out.println("Marks of Subject 1: " + Arrays.toString(mark));
        int sum = 0;
        for(int num: mark){
            System.out.println(num);
            sum += num;
        }
        System.out.println("Total sum: " + sum);
    }
}
