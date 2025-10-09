package Day2.Polymorphism;

public class Animal {

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
 class Main {
     public static void main(String[] args) {
        // Animal myAnimal = new Animal(); // Animal reference and object
         Animal myCat = new Cat(); // Animal reference but Cat object

         //myAnimal.sound(); // Outputs "Animal makes a sound"
         myCat.sound(); // Outputs "Cat meows"

         Animal mydog = new Dog(); // Animal reference but Dog object
         mydog.sound(); // Outputs "Dog barks"
     }
 }
