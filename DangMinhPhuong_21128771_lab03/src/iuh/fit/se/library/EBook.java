package iuh.fit.se.library;

public class EBook extends Book {
    public EBook(String title, String author, String genre) {
        super(title, author, genre);
    }

    @Override
    public void displayInfo() {
        System.out.println("📱 Sách điện tử: " + title + " | ✍ " + author + " | 📚 " + genre);
    }
}