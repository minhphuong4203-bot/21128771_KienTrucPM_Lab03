package iuh.fit.se.library;

import java.util.List;
import java.util.stream.Collectors;

class SearchByCategory implements SearchStrategy {
    @Override
    public List<Book> search(List<Book> books, String keyword) {
        return books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase(keyword))
                .collect(Collectors.toList());
    }
}
