package iuh.fit.se.library;

class StandardBorrow implements BorrowableBook {
    private Book book;

    public StandardBorrow(Book book) {
        this.book = book;
    }

    public void borrow() {
        System.out.println("📚 Mượn sách: " + book.getTitle());
    }
}