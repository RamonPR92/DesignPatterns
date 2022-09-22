package patterns.observerpattern;

public class MXPesoObserver implements Observer{

    private Double exchangeValue;
    private Subject subject;

    public MXPesoObserver() {
        exchangeValue = 20.0;
    }

    @Override
    public void update() {
        System.out.println("DOLLAR TO MEXICAN PESO:" + (subject.getState() * exchangeValue));
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
