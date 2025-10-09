package Day2.BasicClassAndObject;
/*Using Object References*/

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class mainPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
         p1.setName("Ram");  // Error: Name has private access in Person
        Person p2 = new Person();
            p1 =p2;
            p2.setName("Sita");
        System.out.println(p1.getName());

    }
}
