package Day3.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {
    public static void main(String[] args) {
        System.out.println("HashMap Example");
        Map<Integer, String> map = new HashMap<>();
        map.put(4, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");
        map.put(1, "Grapes");
        map.put(6, "Mango");
        map.put(5, "Pineapple");
        System.out.println("Map: " + map);
        System.out.println("Size of Map: " + map.size());
        System.out.println("Value for key 2: " + map.get(2));
        map.remove(3);
        System.out.println("Map after removing key 3: " + map);
        System.out.println("Size of Map after removal: " + map.size());
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
        TreeMap<Integer, String> integerStringTreeMap = new TreeMap<>(map);
        integerStringTreeMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}
