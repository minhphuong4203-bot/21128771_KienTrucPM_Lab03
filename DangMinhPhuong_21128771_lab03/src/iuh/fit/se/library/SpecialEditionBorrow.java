package iuh.fit.se.library;

class SpecialEditionBorrow implements BorrowableBook {
    private BorrowableBook book;

    public SpecialEditionBorrow(BorrowableBook book) {
        this.book = book;
    }

    public void borrow() {
        book.borrow();
        System.out.println("✨ Yêu cầu phiên bản đặc biệt.");
    }
}