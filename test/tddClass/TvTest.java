package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TvTest {
    @Test
    void toCreateATelevisionTest() {
        Tv joe = new Tv();
        assertNotNull(joe);
    }

    @Test
    void toTurnOnTheTelevisionTest() {
        Tv joe = new Tv();
        joe.switchOn();
        assertEquals(true, joe.isOn());
    }

    @Test
    void toTurnOffTheTelevisionTest() {
        Tv joe = new Tv();
        joe.switchOn();
        joe.switchOff();
        assertEquals(true, joe.isOn());
    }

    @Test
    void toIncreaseChannels() {
        Tv joe = new Tv();
        joe.switchOn();
        joe.increaseChannel();
        assertEquals(1, joe.getChannel());
    }

    @Test
    void toDecreaseChannels() {
        Tv joe = new Tv();
        joe.switchOn();
        joe.increaseChannel();
        joe.decreaseChanel();
        assertEquals(0, joe.getChannel());
    }

    @Test
    void toSwitchChannel() {
        Tv joe = new Tv();
        joe.switchOn();
        joe.changeChannel(25);
        assertEquals(25, joe.getChannel());
    }

    @Test
    void increaseVolumeTest() {
        Tv joe = new Tv();
        joe.switchOn();
        joe.increaseVolume();
        assertEquals(1, joe.getVolume());
    }

    @Test
    void decreaseVolumeTest() {
        Tv joe = new Tv();
        joe.switchOn();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.decreaseVolume();
        assertEquals(1, joe.getVolume());
    }

    @Test
    void limitTheHighestChannelTo40() {
        Tv joe = new Tv();
        joe.switchOn();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        joe.increaseChannel();
        assertEquals(40, joe.getChannel());
    }

    @Test
    void channelCannotGoBelow0() {
        Tv joe = new Tv();
        joe.switchOn();
        joe.increaseChannel();
        joe.decreaseChanel();
        joe.decreaseChanel();
        assertEquals(0, joe.getChannel());
    }

    @Test
    void volumeCannotGoBelowLimit() {
        Tv joe = new Tv();
        joe.switchOn();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.decreaseVolume();
        joe.decreaseVolume();
        joe.decreaseVolume();
        assertEquals(0, joe.getVolume());
    }

    @Test
    void volumeCannotGoAboveLimit() {
        Tv joe = new Tv();
        joe.switchOn();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        joe.increaseVolume();
        assertEquals(40, joe.getVolume());

    }
}