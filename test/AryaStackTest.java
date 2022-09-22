import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AryaStackTest {
    @Test
    public void stackCanBeCreated(){
        Stack stack = new Stack();
        assertNotNull(stack);
    }
}
