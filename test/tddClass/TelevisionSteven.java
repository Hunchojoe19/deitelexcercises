package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TelevisionSteven {
        @Test
        public void testThatTelevisionCanBeCreated(){
            Television tv = new Television();
            assertNotNull(tv);

    }
    @Test
    public void testThatTelevisionCanBeTurnedOn(){
        Television tv = new Television();
        tv.Power();
        assertEquals(true, tv.isOn());
}
  @Test
    public void testThatTelevisionCanChangeChannel(){
            Television tv = new Television();
             tv.Power();
            tv.setChannel();
            assertEquals(1, tv.getChannel());

        }
        @Test
    public void testThatTelevisionCanBeReduced(){
            Television tv = new Television();
            tv.Power();
            tv.setChannel();
            tv.decreaseChannel();
            assertEquals(0, tv.getChannel());
        }
        @Test
    public void testThatTelevisionHasVolume(){
            Television tv = new Television();
            tv.Power();
            tv.setChannel();
            tv.setVolume();
            assertEquals(1,tv.getVolume());

        }
        @Test
    public void testThatTelevisionVolumeCanBeReduced(){
            Television tv = new Television();
            tv.Power();
            tv.setChannel();
            tv.setVolume();
            tv.reduceVolume();
            assertEquals(0,tv.getVolume());
        }

}

