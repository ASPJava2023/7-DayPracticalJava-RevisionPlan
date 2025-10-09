package Day2.BasicClassAndObject;

public class Book {
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

}
class MainBook {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Java Programming");
        book.setAuthor("John Doe");

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
    }
}
