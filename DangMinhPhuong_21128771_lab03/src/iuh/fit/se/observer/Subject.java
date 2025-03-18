package iuh.fit.se.observer;

public interface Subject {
    void register(Observer obj);

    void notifyObserver();

    Object getUpdate(Observer obj);

}
