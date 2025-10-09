package Day2.Polymorphism;

public interface Shape {
    void draw();
}
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
class rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
class App {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        shape1.draw(); // Output: Drawing a Circle

        Shape shape2 = new rectangle();
        shape2.draw(); // Output: Drawing a Rectangle
    }
}

