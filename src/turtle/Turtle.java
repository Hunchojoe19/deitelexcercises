package turtle;

import static turtle.Direction.*;


public class Turtle {
    private Pen pen = new Pen();
    private Direction currentDirection = EAST;
    public boolean isPenDown() {
        return pen.isDown();
    }

    public void penDown() {
        pen.penDown();
    }
    public void penUp(){
        pen.penUp();
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if (currentDirection==EAST)currentDirection = SOUTH;
        else if (currentDirection == SOUTH)currentDirection = WEST;
    }

    public void turnLeft() {
        if (currentDirection == EAST) currentDirection = NORTH;
    }

    public void move(int numberOfSteps) {

    }
}
