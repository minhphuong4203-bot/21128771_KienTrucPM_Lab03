package iuh.fit.se.library;

public class AudioBook extends Book {
    public AudioBook(String title, String author, String genre) {
        super(title, author, genre);
    }

    @Override
    public void displayInfo() {
        System.out.println("🎧 Sách nói: " + title + " | ✍ " + author + " | 📚 " + genre);
    }
}