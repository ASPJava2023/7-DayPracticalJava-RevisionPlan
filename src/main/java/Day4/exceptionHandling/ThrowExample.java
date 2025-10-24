package Day4.exceptionHandling;

public class ThrowExample {
    public static void main(String[] args) {
        int age = 21;
        if(age<18){
            throw  new RuntimeException("Not valid age to vote");
        }
        else{
            System.out.println("Welcome to vote");
        }
     }
}

