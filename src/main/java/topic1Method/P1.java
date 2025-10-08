package topic1Method;

import javax.xml.transform.stream.StreamSource;

public class P1 {
    public static void greet() {
        System.out.println("Hello, welcome to Java methods!");
    }

    public  static void greet( String name) {
        System.out.println("Hello "+name +", welcome to Java methods!");
    }
      public static String greetMsg(){
        return "Good Morning";
      }

    public static void main(String[] args) {
        greet("Ram ji");
        System.out.println("-------------------");
        greet();
        System.out.println("-------------------");
         String msg = greetMsg();
         System.out.println(msg);

    }
}
