package patterns.abstractfactory.light;

import patterns.abstractfactory.AcceptDialogAbstarctFactory;
import patterns.abstractfactory.Button;
import patterns.abstractfactory.Dialog;

public class LightAccepDialogFactory implements AcceptDialogAbstarctFactory {
    @Override
    public Dialog createDialog() {
        return new LightDialog();
    }

    @Override
    public Button createButton() {
        return new LigthButton();
    }
}
