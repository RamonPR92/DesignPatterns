package patterns.command;

import patterns.command.commands.DownCommand;
import patterns.command.commands.OffLightsCommand;
import patterns.command.commands.OnLightsCommand;
import patterns.command.commands.UpCommand;

public class CommandApp {
    public static void main(String[] args) {

        Receiver lampara = new Receiver();

        Invoker control = new Invoker(
                new OnLightsCommand(lampara),
                new OffLightsCommand(lampara),
                new UpCommand(lampara),
                new DownCommand(lampara)
        );

        control.clicOn();
        control.clicOff();
        control.clicUp();
        control.clicDown();
    }
}
