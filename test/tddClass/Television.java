package tddClass;

public class Television {
    private boolean button;
    private int volume;
    int channel;

    public void Power() {
        if (button) {
            button = false;

        } else {
            button = true;
        }

    }

    public boolean isOn() {
        return button;
    }

    public void setChannel() {
        channel = channel + 1;}


    public int getChannel() {
        return channel;
    }

    public void decreaseChannel() {
    channel =  channel - 1;

    }

    public void setVolume() {
        volume = volume + 1;
    }

    public int getVolume() {
        return volume;
    }

    public void reduceVolume() {
    }
}
