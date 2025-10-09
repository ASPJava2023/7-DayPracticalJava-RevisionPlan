package Day2.BasicClassAndObject;

public class StudentE {
    String name;
    StudentE(String name){
        this.name = name;
    }
    StudentE( StudentE s){
        this.name = s.name;
    }

    public static void main(String[] args) {
        StudentE s1 = new StudentE("Ram");
        StudentE s2 = new StudentE(s1);
        System.out.println(s2.name);
    }
}
