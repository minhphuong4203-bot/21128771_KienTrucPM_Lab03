package iuh.fit.se.library;

class ExtendedBorrow implements BorrowableBook {
    private BorrowableBook book;

    public ExtendedBorrow(BorrowableBook book) {
        this.book = book;
    }

    public void borrow() {
        book.borrow();
        System.out.println("⏳ Gia hạn thời gian mượn.");
    }
}