package patterns.proxy;

public class Cash implements Payment{
    @Override
    public void pay(Double amount) {
        System.out.println("Make payment for " + amount);
    }
}
