package patterns.proxy;

import java.time.LocalDate;

public class CreditCard implements Payment {

    private Cash cash;

    public CreditCard(Cash cash) {
        this.cash = cash;
    }

    @Override
    public void pay(Double amount) {
        cash.pay(amount);
    }

    public Integer getSecurityNumber(){
        return 912;
    }

    public LocalDate getExpirityDate(){
        return LocalDate.of(2023, 5, 13);
    }

    public String getCardNumber(){
        return "0099 9992 0089 1123";
    }
}
