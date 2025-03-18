package iuh.fit.se.library;

import java.util.List;

class BookSearch {
    private SearchStrategy strategy;

    public void setStrategy(SearchStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Book> search(List<Book> books, String keyword) {
        if (strategy == null) {
            throw new IllegalStateException("Chưa chọn chiến lược tìm kiếm!");
        }
        return strategy.search(books, keyword);
    }
}
