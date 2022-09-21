package patterns.observerpattern;;

public interface Subject<T> {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObservers();
    void setState(T value);
    T getState();
}
