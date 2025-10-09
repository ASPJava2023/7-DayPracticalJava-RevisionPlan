package Day3;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Shyam");
        names.add("Hari");
        names.add("Gita");
        names.add("Sita");
        names.forEach(n->System.out.println(n));
        names.remove("Shyam");
        System.out.println("After removing Shyam");
        names.forEach(n->System.out.println(n));
        System.out.println("Size of collection: " + names.size());
        System.out.println("Is collection empty? " + names.isEmpty());
        System.out.println("Does collection contain 'Gita'? " + names.contains("Gita"));
    }
}
