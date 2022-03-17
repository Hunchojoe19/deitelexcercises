package tddClass.autoBike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoBikeTest {
    @Test
    void autoBikeCanBeTurnedOn() {
        Bike creed = new Bike();
        creed.setButton();
        assertEquals(true, creed.isOn());
    }

    @Test
    void autoBikeCanBeTurnedOff() {
        Bike creed = new Bike();
        creed.setButton();
        creed.setButton();
        assertEquals(false, creed.isOn());
    }

    @Test
    void autoBikeCanBeAcceleratedBy1() {
        Bike creed = new Bike();
        creed.setButton();
        creed.accelerate();
        assertEquals(1, creed.getAccelerate());
    }

    @Test
    void autoBikeCanBeAcceleratedBy2() {
        Bike creed = new Bike();
        creed.setButton();
        creed.accelerate();
        creed.accelerate();
        assertEquals(2, creed.getAccelerate());
    }

    @Test
    void autoBikeCanBeAcceleratedBy3() {
        Bike creed = new Bike();
        creed.setButton();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        assertEquals(3, creed.getAccelerate());
    }

    @Test
    void autoBikeCanBeAcceleratedBy4() {
        Bike creed = new Bike();
        creed.setButton();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        assertEquals(4, creed.getAccelerate());
    }

    @Test
    void autoBikeCanAutomaticallyChangeToGear1() {
        Bike creed = new Bike();
        creed.setButton();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        assertEquals(20, creed.getAccelerate());
    }

    @Test
    void autoBikeCanAutomaticallyChangeFromGear1ToGear2() {
        Bike creed = new Bike();
        creed.setButton();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();

        creed.accelerate();
        assertEquals(25, creed.getAccelerate());
    }

    @Test
    void autoBikeCanAutomaticallyChangeFromGear2ToGear3() {
        Bike creed = new Bike();
        creed.setButton();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();

        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();


        creed.accelerate();
        creed.accelerate();
        assertEquals(37, creed.getAccelerate());
    }

    @Test
    void autoBikeCanAutomaticallyChangeFromGear3ToGear4() {
        Bike creed = new Bike();
        creed.setButton();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();

        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();
        creed.accelerate();


        creed.accelerate();
        creed.accelerate();
        creed.accelerate();

        creed.accelerate();
        creed.accelerate();
        assertEquals(47, creed.getAccelerate());
    }
}