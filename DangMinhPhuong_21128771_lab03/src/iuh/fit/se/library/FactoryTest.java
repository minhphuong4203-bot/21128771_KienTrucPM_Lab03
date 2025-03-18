package iuh.fit.se.library;

public class FactoryTest {
    public static void main(String[] args) {
        BookFactory printedFactory = new PrintedBookFactory();
        BookFactory ebookFactory = new EBookFactory();
        BookFactory audioFactory = new AudioBookFactory();

        Book printedBook = printedFactory.createBook("Dế Mèn Phiêu Lưu Ký", "Tô Hoài", "Văn học");
        Book ebook = ebookFactory.createBook("Clean Code", "Robert C. Martin", "Lập trình");
        Book audioBook = audioFactory.createBook("Harry Potter", "J.K. Rowling", "Fantasy");

        printedBook.displayInfo();
        ebook.displayInfo();
        audioBook.displayInfo();
    }
}
