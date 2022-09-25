package patterns.command.commands;

import patterns.command.Receiver;

public class DownCommand implements Command{

    private Receiver receiver;

    public DownCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.down();
    }

    @Override
    public void unexecute() {
        receiver.down();
    }
}
