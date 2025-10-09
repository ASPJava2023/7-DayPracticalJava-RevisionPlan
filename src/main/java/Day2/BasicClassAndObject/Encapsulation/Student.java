package Day2.BasicClassAndObject.Encapsulation;

public class Student {
    private int Mark;

    public int getMark() {
         return Mark;
    }

    public void setMark(int mark) {
        if(mark < 0 || mark > 100){
            System.out.println("Invalid Mark");
            return;
        }
        Mark = mark;
    }
}
class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.setMark(105);
        System.out.println("Mark: " + s.getMark());
        s.setMark(95);
        System.out.println("Mark: " + s.getMark());
    }
}
