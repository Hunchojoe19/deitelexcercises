import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tddClass.Stacks;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stacks stack;
    @BeforeEach
    public void setUp(){
        stack = new Stacks();
    }
    @Test
    void stackIsNotNull(){
        assertNotNull(stack);
    }
    @Test
    void stackIsNotEmpty(){
        assertTrue(stack.isEmpty());
    }
    @Test
    void stackCanPushX(){
        stack.push(32);
        assertFalse(stack.isEmpty());
    }
    @Test
    void stackCanPopXTest(){
        stack.push(34);
        assertEquals(34, stack.pop());
    }
    @Test
    void stackCanPushXAndPopXAndBecomesEmptyTest(){
        stack.push(54);
        stack.pop();
        assertTrue(stack.isEmpty());
    }
    @Test
    void stackPushXAndPopYStackShouldNotBeEmptyTest(){
        stack.push(34);
        stack.push(65);
        stack.pop();
        assertFalse(stack.isEmpty());
    }
    @Test
    void stackCanPeekTest(){
        stack.push(14);
        stack.push(18);
        assertEquals(18, stack.peek());
    }
}
