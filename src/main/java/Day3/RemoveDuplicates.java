package Day3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    //Removing Duplicates using Set
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 21, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        // list.stream().distinct().sorted().forEach(System.out::println);
        Set<Integer> myset = new HashSet<>(list);
        System.out.println(myset);
        System.out.println("Does set contains 10? " + myset.contains(10));
    }
}
