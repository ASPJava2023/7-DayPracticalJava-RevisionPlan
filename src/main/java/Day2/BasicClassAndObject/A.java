package Day2.BasicClassAndObject;

public class A {
    A(){
        System.out.println("A's Constructor");
    }
    static class B extends A{
        B(){
          //  super();
            System.out.println("B's Constructor");
        }
    }
    public static void main(String[] args) {
        B obj = new B();
    }
}
