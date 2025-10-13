package Day3.Generics;

public class Generics {
        public static void main(String[] args) {
            Box<Integer> intBox = new Box<>(123);
            Box<String> strBox = new Box<>("Hello");

            System.out.println("Integer Value: " + intBox.getValue());
            System.out.println("String Value: " + strBox.getValue());
        }

    }
