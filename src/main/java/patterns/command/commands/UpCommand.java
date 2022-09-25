package patterns.command.commands;

import patterns.command.Receiver;

public class UpCommand implements Command{


    private Receiver receiver;

    public UpCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.up();
    }

    @Override
    public void unexecute() {
        receiver.up();
    }
}
