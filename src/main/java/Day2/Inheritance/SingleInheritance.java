package Day2.Inheritance;

class Animal {
    String color = "Four";
    void eat() {
        System.out.println("Eating...");
    }
}
class Dog extends Animal {
    String typeOfLeges = "two";
    void bark() {
        System.out.println("Barking...");
    }
    void getColor() {
        System.out.println("Dog typeOfLeges: " + typeOfLeges); // Dog's typeOfLeges
        System.out.println("Animal typeOfLeges: " + super.color); // Animal's typeOfLeges
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited method
        dog.bark(); // Dog's own method
        dog.getColor(); // Demonstrating use of super keyword

    }
}
