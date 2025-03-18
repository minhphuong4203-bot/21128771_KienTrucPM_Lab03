package iuh.fit.se.library;

public class EBookFactory implements BookFactory {
    public Book createBook(String title, String author, String genre) {
        return new EBook(title, author, genre);
    }
}