package Day2.Inheritance;

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}
    class Bike extends Vehicle {
        void run () {
            System.out.println("Bike is running");
        }
    }


public class MethodOverriding {
    public static void main(String[] args) {
        Bike obj = new Bike();

        obj.run(); //calls the method in Bike class
       // super.obj.run(); //calls the method in Vehicle class

        ((Vehicle)obj).run(); //calls the method in Vehicle class
    }
}
