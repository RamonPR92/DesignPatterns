package patterns.bridge;

public class TV implements Device{
    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void enabled() {

    }

    @Override
    public void disable() {

    }

    @Override
    public Integer getVolume() {
        return null;
    }

    @Override
    public void setVolume(Integer volume) {

    }

    @Override
    public Integer getChanel() {
        return null;
    }

    @Override
    public void setChanel(Integer chanel) {

    }
}
