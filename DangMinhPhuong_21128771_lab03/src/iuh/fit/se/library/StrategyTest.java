package iuh.fit.se.library;

public class StrategyTest {
    public static void main(String[] args) {
        Library library = Library.getInstance();

        // Tạo Factory và thêm sách
        BookFactory printedFactory = new PrintedBookFactory();
        library.addBook(printedFactory, "Dế Mèn Phiêu Lưu Ký", "Tô Hoài", "Văn học");
        library.addBook(printedFactory, "Lập Trình Java", "Nguyễn Văn B", "Lập trình");
        library.addBook(printedFactory, "Harry Potter", "J.K. Rowling", "Fantasy");

        // Tạo công cụ tìm kiếm
        BookSearch searchEngine = new BookSearch();

        // 🔎 Tìm theo tên
        searchEngine.setStrategy(new SearchByTitle());
        System.out.println("\n🔎 Tìm kiếm sách theo tên 'Harry Potter':");
        searchEngine.search(library.getBooks(), "Harry Potter").forEach(Book::displayInfo);

        // 🔎 Tìm theo tác giả
        searchEngine.setStrategy(new SearchByAuthor());
        System.out.println("\n🔎 Tìm kiếm sách theo tác giả 'Tô Hoài':");
        searchEngine.search(library.getBooks(), "Tô Hoài").forEach(Book::displayInfo);

        // 🔎 Tìm theo thể loại
        searchEngine.setStrategy(new SearchByCategory());
        System.out.println("\n🔎 Tìm kiếm sách theo thể loại 'Lập trình':");
        searchEngine.search(library.getBooks(), "Lập trình").forEach(Book::displayInfo);
    }
}
