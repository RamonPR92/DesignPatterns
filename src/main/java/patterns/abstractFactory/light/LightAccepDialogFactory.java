package patterns.abstractFactory.light;

import patterns.abstractFactory.AcceptDialogAbstarctFactory;
import patterns.abstractFactory.Button;
import patterns.abstractFactory.Dialog;

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
