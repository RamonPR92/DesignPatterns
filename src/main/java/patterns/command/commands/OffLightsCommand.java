package patterns.command.commands;

import patterns.command.Receiver;

public class OffLightsCommand implements Command{

    private Receiver receiver;

    public OffLightsCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.off();
    }

    @Override
    public void unexecute() {
        receiver.off();
    }
}
