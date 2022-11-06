package patterns.bridge;

public interface Device {

    boolean isEnabled();
    void enabled();
    void disable();
    Integer getVolume();
    void setVolume(Integer volume);
    Integer getChanel();
    void setChanel(Integer chanel);
}
