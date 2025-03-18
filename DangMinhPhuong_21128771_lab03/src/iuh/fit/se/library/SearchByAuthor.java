package iuh.fit.se.library;

import java.util.List;
import java.util.stream.Collectors;

class SearchByAuthor implements SearchStrategy {
    @Override
    public List<Book> search(List<Book> books, String keyword) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(keyword))
                .collect(Collectors.toList());
    }
}
