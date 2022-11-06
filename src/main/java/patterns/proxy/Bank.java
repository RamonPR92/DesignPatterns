package patterns.proxy;

import java.time.LocalDate;

public class Bank {

    public void makePay(CreditCard creditCard, Double amount){
        if(isInvalidCreditCard(creditCard))
            throw new RuntimeException("La tarjeta no es valida");

        creditCard.pay(amount);
    }

    private boolean isInvalidCreditCard(CreditCard creditCard){
        return (creditCard.getCardNumber().isEmpty()
                || creditCard.getExpirityDate().isAfter(LocalDate.now())
                || creditCard.getSecurityNumber().equals(0));
    }
}
