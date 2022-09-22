import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tddClass.Queues;

import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    private Queues queues;
    @BeforeEach
    public void setup(){
        queues = new Queues();
    }
    @Test
    void queueIsNotNullTest(){
        assertNotNull(queues);
    }
    @Test
   void queuesIsNotEmptyTest(){
        assertTrue(queues.isEmpty());
   }
   @Test
    void queuesCanAddTest(){
        queues.push("Garri");
        assertFalse(queues.isEmpty());
   }
   @Test
    void queuesCanRemoveTest(){
        queues.push("Beans");
        queues.pop();
        assertFalse(queues.isEmpty());
   }
   @Test
    void queuesCanPushXAndPopXAndXIsGottenTest(){
        queues.push("Yam");
        String element = queues.pop();
        assertEquals("Yam", element);
   }
   @Test
    void queuesCanPushXAndYAndPopXTest(){
        queues.push("Yam");
        queues.push("Beans");
        String element = queues.pop();
        assertEquals("Yam", element);
   }
   @Test
    void queuesCantPopYBeforeXTest(){
        queues.push("Beans");
        queues.push("Water");
        assertEquals("Beans", queues.pop());
        assertEquals("Water", queues.pop());
        assertFalse(queues.isEmpty());
   }
   @Test
    void itemsInQueuesCanBeRetrievedTest(){
    queues.push("Beans");
    queues.push("Milk");
    queues.push("Water");
    assertEquals("Water", queues.peek());
    }
    @Test
    void queueElementsMustBeBetweenTheArrayLengthTest(){
        queues.push("Beans");
        queues.push("Milk");
        queues.push("Water");
        queues.push("Yam");
        queues.push("Nut");
        assertEquals("Nut", queues.peek());
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> queues.push("picky"));
    }
}
