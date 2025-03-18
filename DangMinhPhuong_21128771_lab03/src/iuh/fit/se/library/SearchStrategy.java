package iuh.fit.se.library;

import java.util.List;

interface SearchStrategy {
    List<Book> search(List<Book> books, String keyword);
}
