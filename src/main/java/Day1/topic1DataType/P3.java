package Day1.topic1DataType;

public class P3 {
    public static void main(String[] args) {
        String str = new String("Ram");
        System.out.println("This is First "+str);
        String str2 = "Ram";
        System.out.println("This is second "+str2);
        String str3 = "Ram";
        System.out.println("This is First "+str3);
        if (str==str2) {
            System.out.println("Both are same");
        }
        else
        {
            System.out.println("Both are different");
        }
        if (str2==str3) {
            System.out.println("Both are same");
        }
        else
        {
            System.out.println("Both are different");
        }
    }
}
