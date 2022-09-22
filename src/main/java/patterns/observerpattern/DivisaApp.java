package patterns.observerpattern;

public class DivisaApp {

    public static void main(String[] args) {

        Subject dollar = new DollarSubject();

        Observer pesoMX = new MXPesoObserver();
        pesoMX.setSubject(dollar);

        Observer pesoARG = new ARGPesoObserver();
        pesoARG.setSubject(dollar);

        Observer pesoCOL = new COLPesoObserver();
        pesoCOL.setSubject(dollar);

        dollar.addObserver(pesoMX);
        dollar.addObserver(pesoARG);
        dollar.addObserver(pesoCOL);

        System.out.println("*** Cambio de $5 ***");
        dollar.setState(5.0);
        System.out.println("*** Cambio de $10 ***");
        dollar.setState(10.0);
        System.out.println("*** Cambio de $15 ***");
        dollar.setState(15.0);
    }

}
