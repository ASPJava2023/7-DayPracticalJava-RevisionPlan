package Day2.BasicClassAndObject;

public class Printer {
    void printDocument(Studentmy student) {
    System.out.println("Student Name: " + student.toString());

    }
}
    class Studentmy {
        String name;
        int age;

        Studentmy(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Age: " + age;
        }
    }

    class TestPrinter {
        public static void main(String[] args) {
            Printer printer = new Printer();
            Studentmy student = new Studentmy("Ram", 20);
            printer.printDocument(student);
        }
    }
