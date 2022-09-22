package patterns.observerpattern;

public class COLPesoObserver implements Observer {

    private Double exchangeValue;
    private Subject subject;

    public COLPesoObserver() {
        exchangeValue = 4_407.0;
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("DOLLAR TO COLOMBIAN PESO:" + (subject.getState() * exchangeValue));
    }
}
