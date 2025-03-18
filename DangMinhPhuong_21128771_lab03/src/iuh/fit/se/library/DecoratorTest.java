package iuh.fit.se.library;

public class DecoratorTest {
    public static void main(String[] args) {
        Book book = new PrintedBook("Dế Mèn Phiêu Lưu Ký", "Tô Hoài", "Văn học");

        System.out.println("📌 Mượn sách bình thường:");
        BorrowableBook standardBorrow = new StandardBorrow(book);
        standardBorrow.borrow();

        System.out.println("\n📌 Mượn sách + Gia hạn:");
        BorrowableBook extendedBorrow = new ExtendedBorrow(standardBorrow);
        extendedBorrow.borrow();

        System.out.println("\n📌 Mượn sách + Gia hạn + Phiên bản đặc biệt:");
        BorrowableBook specialEditionBorrow = new SpecialEditionBorrow(extendedBorrow);
        specialEditionBorrow.borrow();
    }
}
