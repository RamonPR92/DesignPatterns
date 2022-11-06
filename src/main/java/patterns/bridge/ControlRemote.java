package patterns.bridge;

public abstract class ControlRemote {

    protected Device device; //this is the bridge

    public ControlRemote(Device device) {
        this.device = device;
    }

    public void tooglePower(){
        if(device.isEnabled())
            device.disable();
        else
            device.enabled();
    }

    public void volumeDown(){
        Integer volume = device.getVolume();
        device.setVolume(volume - 1);
    }

    public void volumeUp(){
        Integer volume = device.getVolume();
        device.setVolume(volume + 1);
    }

    public void channelDown(){
        Integer chanel = device.getChanel();
        device.setChanel(chanel - 1);
    }

    public void channelUp(){
        Integer chanel = device.getChanel();
        device.setChanel(chanel + 1);
    }
}
