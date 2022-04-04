//package tddClass;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//public class CarApplicationTest {
//    private Car benz;
//
//    @BeforeEach
//    public void joe() {
//        benz = new Car("Glx250", "2020", 3_000_000);
//    }
//
//    @Test
//    public void carCanBeCreated() {
//        assertNotNull(benz);
//    }
//
//    @Test
//    public void carCanBeSwitchedOn() {
//        benz.isOn(true);
//        assertEquals(true, benz.isOn(true));
//    }
//
//    @Test
//    public void carCanBeSwitchedOff() {
//        benz.isOn(true);
//        assertEquals(true, benz.isOn(true));
//        benz.isOff(false);
//        assertEquals(false, benz.isOff(false));
//    }
//
//    @Test
//    public void carCanAccelerate() {
//        benz.isOn(true);
//        assertEquals(true, benz.isOn(true));
//        benz.accelerate(23);
//        assertEquals(24, benz.getAccelerate());
//    }
//
//    @Test
//    public void carCanDecelerate() {
//        benz.isOn(true);
//        assertEquals(true, benz.isOn(true));
//        benz.decelerate(16);
//        assertEquals(15, benz.getDecelerate());
//    }
//
//    @Test
//    public void carCanAccelerateToGearTwo() {
//        benz.isOn(true);
//        assertEquals(true, benz.isOn(true));
//        benz.accelerateToGearTwo(21);
//        assertEquals(23, benz.getAccelerateToGearTwo());
//    }
//
//    @Test
//    public void carCanAccelerateToGearThree() {
//        benz.isOn(true);
//        assertEquals(true, benz.isOn(true));
//        benz.accelerateToGearThree(32);
//        assertEquals(35, benz.getAccelerateToGearThree());
//    }
//
//    @Test
//    public void carCanAccelerateToGearFour() {
//        benz.isOn(true);
//        assertEquals(true, benz.isOn(true));
//        benz.accelerateToGearFour(45);
//        assertEquals(49, benz.getAccelerateToGearFour());
//    }
//    @Test
//    public void carCanAutomaticallyChangeFromGearOneToGearTwo(){
//        benz.isOn(true);
//        assertEquals(true, benz.isOn(true));
//        benz.getAccelerate();
//
//    }
//}
