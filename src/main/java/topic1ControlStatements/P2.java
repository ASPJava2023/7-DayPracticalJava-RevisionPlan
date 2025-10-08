package topic1ControlStatements;

public class P2 {
    public static void main(String[] args) {
        //Nested If Example
        int age =25;
        if(age >=18){
            if(age<60){
                System.out.println("Adult");
            } else {
                System.out.println("Senior Citizen");
            }
        } else {
            System.out.println("Minor");
        }
    }
}
