package iuh.fit.se.library;

public class LibrarySystemTest {
    public static void main(String[] args) {
        System.out.println("===== 🏛 HỆ THỐNG QUẢN LÝ THƯ VIỆN 🚀 =====");

        // ✅ 1. Lấy instance Library (Singleton)
        Library library = Library.getInstance();

        // ✅ 2. Observer: Đăng ký nhân viên thư viện nhận thông báo
        LibraryStaff staff1 = new LibraryStaff("Nam");
        LibraryStaff staff2 = new LibraryStaff("Linh");
        library.addObserver(staff1);
        library.addObserver(staff2);

        // ✅ 3. Factory: Tạo các loại sách khác nhau
        BookFactory printedFactory = new PrintedBookFactory();
        BookFactory ebookFactory = new EBookFactory();
        BookFactory audioBookFactory = new AudioBookFactory();

        library.addBook(printedFactory, "Dế Mèn Phiêu Lưu Ký", "Tô Hoài", "Văn học");
        library.addBook(ebookFactory, "Lập Trình Java", "Nguyễn Văn B", "Lập trình");
        library.addBook(audioBookFactory, "Harry Potter", "J.K. Rowling", "Fantasy");

        // ✅ 4. Hiển thị toàn bộ danh sách sách
        System.out.println("\n===== 📚 DANH SÁCH SÁCH HIỆN CÓ =====");
        for (Book book : library.getBooks()) {
            book.displayInfo();
        }

        // ✅ 5. Strategy: Tìm kiếm sách theo tiêu chí khác nhau
        BookSearch searchEngine = new BookSearch();

        System.out.println("\n===== 🔎 TÌM SÁCH THEO TIÊU CHÍ KHÁC NHAU =====");

        searchEngine.setStrategy(new SearchByTitle());
        System.out.println("\n🔎 Kết quả tìm kiếm theo Tên: 'Dế Mèn Phiêu Lưu Ký'");
        searchEngine.search(library.getBooks(), "Dế Mèn Phiêu Lưu Ký").forEach(Book::displayInfo);

        searchEngine.setStrategy(new SearchByAuthor());
        System.out.println("\n🔎 Kết quả tìm kiếm theo Tác giả: 'J.K. Rowling'");
        searchEngine.search(library.getBooks(), "J.K. Rowling").forEach(Book::displayInfo);

        searchEngine.setStrategy(new SearchByCategory());
        System.out.println("\n🔎 Kết quả tìm kiếm theo Thể loại: 'Lập trình'");
        searchEngine.search(library.getBooks(), "Lập trình").forEach(Book::displayInfo);

        // ✅ 6. Decorator: Mượn sách với các tính năng bổ sung
        System.out.println("\n===== 📖 MƯỢN SÁCH =====");
        BorrowableBook standardBorrow = new StandardBorrow(library.getBooks().get(0));
        standardBorrow.borrow();

        System.out.println("\n===== 📖 MƯỢN SÁCH + GIA HẠN THỜI GIAN =====");
        BorrowableBook extendedBorrow = new ExtendedBorrow(standardBorrow);
        extendedBorrow.borrow();

        System.out.println("\n===== 📖 MƯỢN SÁCH + PHIÊN BẢN ĐẶC BIỆT =====");
        BorrowableBook specialEditionBorrow = new SpecialEditionBorrow(standardBorrow);
        specialEditionBorrow.borrow();

        System.out.println("\n===== 🏛 HỆ THỐNG QUẢN LÝ THƯ VIỆN HOÀN THÀNH 🚀 =====");
    }
}
