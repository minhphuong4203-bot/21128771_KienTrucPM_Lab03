package iuh.fit.se.library;

public class PrintedBookFactory implements BookFactory {
    public Book createBook(String title, String author, String genre) {
        return new PrintedBook(title, author, genre);
    }
}