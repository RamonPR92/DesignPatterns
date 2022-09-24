package patterns.abstractFactory.dark;

import patterns.abstractFactory.AcceptDialogAbstarctFactory;
import patterns.abstractFactory.Button;
import patterns.abstractFactory.Dialog;

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
