package Day2.BasicClassAndObject;

public class Box {
    int length, width, height;
    Box(){
        length = width = height = 10;

    }
    Box(int l){
        length = width = height = l;
         }
    Box( int l, int w, int h){
        length = l;
        width = w;
        height = h;

    }

}
class MainBox{
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(20);
        Box b3 = new Box(10,20,30);
        System.out.println("Box 1: "+b1.length+" "+b1.width+" "+b1.height);
        System.out.println("Box 2: "+b2.length+" "+b2.width+" "+b2.height);
        System.out.println("Box 3: "+b3.length+" "+b3.width+" "+b3.height);
    }
}
