package patterns.bridge;

public class Client {
    public static void main(String[] args) {
        Device tv = new TV();
        ControlRemote tvControl = new AdvanceRemoteControl(tv); //this is de bridge
    }
}
