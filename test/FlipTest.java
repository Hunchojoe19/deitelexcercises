import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlipTest {
    @Test
    public void bitNumber(){
        Flip numb = new Flip();
        int result = numb.enterNumber(0);
        assertEquals(1, result);
    }
}
