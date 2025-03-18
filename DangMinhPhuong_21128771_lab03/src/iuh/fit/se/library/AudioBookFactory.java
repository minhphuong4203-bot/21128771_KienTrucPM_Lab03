package iuh.fit.se.library;

public class AudioBookFactory implements BookFactory {
    public Book createBook(String title, String author, String genre) {
        return new AudioBook(title, author, genre);
    }
}