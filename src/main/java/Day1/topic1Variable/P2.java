package Day1.topic1Variable;

public class P2 {
    public static void main(String[] args) {
        /*Create a program that calculates and displays the total marks and percentage of 3 subjects.*/
        int subject1 = 85;
        int subject2 = 90;
        int subject3 = 78;
        double totalMarks = subject1 + subject2 + subject3;
        double percentage =(totalMarks/300)*100;
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}
