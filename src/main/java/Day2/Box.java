package Day2;

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
