package Day2;

public class Student {
    private String name;
    private int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.name = "Ram";
        student1.age = 20;
        student1.displayInfo();
        student2.name = "Shyam";
        student2.age = 22;
        student2.displayInfo();
        student2.age = 25;
        student2.displayInfo();
    }
}
