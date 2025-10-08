package Day1.topic1Method;

public class P2 {
    public String getName(String name) {
        return name;
    }
}
     class p3 {
        public static void main(String[] args) {
            P2 obj = new P2();
            String name = obj.getName("Sita");
            System.out.println(name);
        }

}