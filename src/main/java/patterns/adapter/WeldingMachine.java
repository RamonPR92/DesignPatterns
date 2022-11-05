package patterns.adapter;

public class WeldingMachine  {

    public final Integer voltNeccesary = 220;

    public static void main(String[] args) {
        WeldingMachine weldingMachine = new WeldingMachine();
        ConectorAdapter conectorAdapter = new SterenConectorAdapter( new PowerSupply(), weldingMachine.voltNeccesary);
        System.out.println(conectorAdapter.adaptVoltage());
    }
}
