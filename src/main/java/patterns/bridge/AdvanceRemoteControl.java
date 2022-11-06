package patterns.bridge;

import java.util.List;

public class AdvanceRemoteControl extends ControlRemote {

    public AdvanceRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
    }

    public List<Integer> listChanels() {
        return List.of(1, 2, 3, 4, 5, 7, 9, 11);
    }
}
