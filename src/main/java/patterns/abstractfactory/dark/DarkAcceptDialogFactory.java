package patterns.abstractfactory.dark;

import patterns.abstractfactory.AcceptDialogAbstarctFactory;
import patterns.abstractfactory.Button;
import patterns.abstractfactory.Dialog;

public class DarkAcceptDialogFactory implements AcceptDialogAbstarctFactory {
    @Override
    public Dialog createDialog() {
        return new DarkDialog();
    }

    @Override
    public Button createButton() {
        return new DarkButton();
    }
}
