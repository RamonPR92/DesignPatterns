package patterns.command;

public class Receiver {

    public void on(){
        System.out.println("On lights");
    }

    public void off(){
        System.out.println("off lights");
    }

    public void up(){
        System.out.println("Up intensity of lights");
    }

    public void down(){
        System.out.println("Down intensity of lights");
    }
}
