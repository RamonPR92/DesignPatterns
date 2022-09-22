package patterns.observerpattern;;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObservers();
    Double getState();
    void setState(Double value);
}
