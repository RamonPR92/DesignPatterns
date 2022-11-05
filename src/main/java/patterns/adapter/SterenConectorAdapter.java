package patterns.adapter;

import java.beans.PropertyEditorSupport;

public class SterenConectorAdapter implements ConectorAdapter {

    private PowerSupply powerSupply;
    private Integer voltNeccesary;

    public SterenConectorAdapter(PowerSupply powerSupply, Integer voltNeccesary) {
        this.powerSupply = powerSupply;
        this.voltNeccesary = voltNeccesary;
    }

    @Override
    public Integer adaptVoltage() {
        if(powerSupply.getVoltPower() == 340 && voltNeccesary == 220){
            return powerSupply.getVoltPower() - 120;
        }
        return powerSupply.getVoltPower();
    }
}
