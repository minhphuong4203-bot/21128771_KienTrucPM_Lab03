package iuh.fit.se.library;

public class ObserverTest {
    public static void main(String[] args) {
        Library library = Library.getInstance();

        Observer staff = new LibraryStaff("Admin");
        Observer member = new LibraryMember("Nguyễn Văn A");

        library.addObserver(staff);
        library.addObserver(member);

        // Thêm sách vào thư viện
        BookFactory printedFactory = new PrintedBookFactory();
        library.addBook(printedFactory, "Dế Mèn Phiêu Lưu Ký", "Tô Hoài", "Văn học");
    }
}
