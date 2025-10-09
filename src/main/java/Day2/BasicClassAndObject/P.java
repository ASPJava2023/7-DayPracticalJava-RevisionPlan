package Day2.BasicClassAndObject;


   // Create a Product class with different constructors to initialize product details in different ways.

class Product {
        int id;
        String name;
        double price;

        // Default constructor
        Product() {
            this.id = 0;
            this.name = "Unknown";
            this.price = 0.0;
        }

        // Constructor with id and name
        Product(int id, String name) {
            this.id = id;
            this.name = name;
            this.price = 0.0;
        }

        // Constructor with all details
        Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        void display() {
            System.out.println("Product ID: " + id);
            System.out.println("Product Name: " + name);
            System.out.println("Product Price: $" + price);
            System.out.println();
        }
    }
    public class P {
        public static void main(String[] args) {
            // Using default constructor
            Product product1 = new Product();
            product1.display();

            // Using constructor with id and name
            Product product2 = new Product(101, "Laptop");
            product2.display();

            // Using constructor with all details
            Product product3 = new Product(102, "Smartphone", 699.99);
            product3.display();
        }
    }

