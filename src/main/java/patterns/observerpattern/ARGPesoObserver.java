package patterns.observerpattern;

public class ARGPesoObserver implements Observer {

    private Double exchangeValue;
    private Subject subject;

    public ARGPesoObserver() {
        exchangeValue = 144.35;
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("DOLLAR TO ARGENTINIAN PESO:" + (subject.getState() * exchangeValue));
    }
}
