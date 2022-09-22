package turtle;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static turtle.Direction.*;


import static org.junit.jupiter.api.Assertions.*;


public class TurtleTest {
    Turtle turtle;
    @BeforeEach
    public void setUp(){
        turtle = new Turtle();
    }
    @Test
    void turtleCanBeCreatedTest(){
        assertNotNull(turtle);
    }
    @Test
    void penIsUpByDefaultTest(){
        assertFalse(turtle.isPenDown());
    }
    @Test
    void penIsDownTest(){
        turtle.penDown();
        assertTrue(turtle.isPenDown());
    }
    @Test
    void penCanReturnBackUpTest(){
        turtle.penDown();
        turtle.penUp();
        assertFalse(turtle.isPenDown());
    }
    @Test
    void turtleTurnTowardsEastByDefaultTest(){
       assertEquals(EAST, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnRightFromEastToSouthTest(){
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnRightFromSouthToWestTest(){
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnTowardsLeftFromEastToNorthTest(){
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirection());
    }
    @Test
    void TurtleCanMoveTowardsEastTest(){
        turtle.move(3);
    }
}
