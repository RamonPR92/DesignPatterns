package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class DollarSubject implements Subject {
    private List<Observer> observers;
    private Double stateValue;

    public DollarSubject() {
        observers = new ArrayList<>();
        stateValue = 0.0;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        observers.forEach(observer -> observer.update());
    }

    @Override
    public void setState(Double value) {
        this.stateValue = value;
        notifyAllObservers();
    }

    @Override
    public Double getState() {
        return stateValue;
    }
}
