package Day4.exceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
    static void readFile() throws IOException {
        FileReader fileReader = new FileReader("non_existent_file.txt");
        fileReader.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
