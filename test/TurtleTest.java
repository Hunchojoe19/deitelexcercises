import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tddClass.Positions;
import tddClass.Turtle;

import javax.swing.text.Position;

import static org.junit.jupiter.api.Assertions.*;
import static tddClass.Direction.*;

public class TurtleTest {
    private Turtle turtle;
    @BeforeEach
    public void setup(){
        turtle = new Turtle();
    }
    @Test
    void turtleExistsTest(){
        assertNotNull(turtle);
    }
    @Test
    void turtlePenIsUpByDefault(){
        turtle.isPenDown();
        assertFalse(turtle.isPenDown());
    }
    @Test
    void turtlePenMoveDownTest(){
        turtle.isPenUp();
        assertTrue(turtle.isPenUp());
        turtle.penDown();
        assertTrue(turtle.isPenDown());
    }
    @Test
    void turtlePenMoveUpWhenDownTest(){
        turtle.penDown();
        assertTrue(turtle.isPenDown());
        turtle.penUp();
        assertFalse(turtle.isPenDown());
    }
    @Test
    void turtlePositionIsEastByDefaultTest(){
        assertSame(EAST, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanMoveRightFromEastTest(){
        turtle.getCurrentDirection();
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanMoveRightFromSouthTest(){
        turtle.getCurrentDirection();
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
    }
    @Test
    void turtlePositionIsFacingEastTest(){
        turtle.getCurrentDirection();
        assertSame(EAST, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnLeftFromEastTest(){
        turtle.getCurrentDirection();
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanMoveForwardInEastDirection(){
        turtle.move(3);
        assertEquals(new Positions(0,2), turtle.getCurrentPosition());
    }
}
