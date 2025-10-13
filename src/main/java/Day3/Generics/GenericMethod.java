package Day3.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {
    public static <T> void printArray(T[] arr) {
        for (T item : arr) System.out.println(item);
    }
    static <T> void show(T item) {
        System.out.println(item);
    }


    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3};
        printArray(nums);
        String[] strs = {"Hello", "World", "!"};
        printArray(strs);
        show("Generic Method");
        show(123);
        show(List.of(1, 2, 3, 4, 5));
    }
}