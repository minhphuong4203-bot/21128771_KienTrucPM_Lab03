package iuh.fit.se.library;

import java.util.*;

public class Library {
    private static Library instance;
    private List<Book> books;
    private List<Observer> observers;

    private Library() {
        books = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static Library getInstance() {
        if (instance == null) instance = new Library();
        return instance;
    }

    public void addBook(BookFactory factory, String title, String author, String genre) {
        Book book = factory.createBook(title, author, genre);
        books.add(book);
        notifyObservers("📢 Sách mới: " + title);
    }

    public void displayBooks() {
        for (Book book : books) book.displayInfo();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers(String message) {
        for (Observer observer : observers) observer.update(message);
    }

    public List<Book> getBooks() {
        return books;
    }
}
