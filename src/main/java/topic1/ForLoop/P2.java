package topic1.ForLoop;

public class P2 {
    public static void main(String[] args) {
/*        Factorial of a Number (e.g., 5!)*/
        long  number =12;
        long factorial =1;
        for (int i=1;i<=number;i++){
            factorial = factorial*i;
          }
        System.out.println("Factorial of "+number+" is: "+factorial);
    }
}
