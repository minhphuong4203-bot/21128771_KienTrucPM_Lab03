package iuh.fit.se.library;

public class PrintedBook extends Book {
    public PrintedBook(String title, String author, String genre) {
        super(title, author, genre);
    }

    @Override
    public void displayInfo() {
        System.out.println("📖 Sách giấy: " + title + " | ✍ " + author + " | 📚 " + genre);
    }
}

