package Day4.exceptionHandling;

public class CheckedUnchecked {
    static void checked() throws Exception {
        throw new Exception("Checked Exception");
    }

    public static void main(String[] args) {
        try {
            checked();
        } catch (Exception e) {
            System.out.println("Handled checked exception");
        }

        // Unchecked - No throws needed
        throw new RuntimeException("Unchecked Exception");
    }
}
