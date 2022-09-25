package patterns.command.commands;

import patterns.command.Receiver;

public class OnLightsCommand implements Command{

    private Receiver receiver;

    public OnLightsCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.on();
    }

    @Override
    public void unexecute() {
        receiver.on();
    }
}
