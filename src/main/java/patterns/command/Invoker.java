package patterns.command;

import patterns.command.commands.Command;

public class Invoker {

    private Command onLights;
    private Command offLights;
    private Command up;
    private Command down;

    public Invoker(Command onLights, Command offLights, Command up, Command down) {
        this.onLights = onLights;
        this.offLights = offLights;
        this.up = up;
        this.down = down;
    }

    public void clicOn(){
        onLights.execute();
    }

    public void clicOff(){
        offLights.execute();
    }

    public void clicUp(){
        up.execute();
    }


    public void clicDown(){
        down.execute();
    }


}
