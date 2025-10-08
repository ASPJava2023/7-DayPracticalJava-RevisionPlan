package Day2;

public class Book2 {
    private String title;
    private String author;

    Book2(String title, String author) {
        this.title = title;
        this.author = author;
    }
    @Override
    public String toString() {
        return " Book Title: " + title + ", Author: " + author;
    }
}
class Main {
    public static void main(String[] args) {
        Book2 book = new Book2("1984", "George Orwell");
        System.out.println("Book created successfully."+book.toString());
    }
}
