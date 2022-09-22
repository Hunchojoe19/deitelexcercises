package tddClass;

import static tddClass.Direction.*;

public class Turtle {
    private Pen biro = new Pen ();
    private Direction currentDirection = EAST;
    private Positions currentPosition = new Positions(0,0);

    public boolean isPenUp(){
        return true;
    }
    public boolean isPenDown() {
        return biro.isDown();
    }

    public void penDown() {
        biro.penDown();
    }
    public void penUp(){
        biro.penUp();
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public Direction turnRight() {
        if (currentDirection == SOUTH)
            currentDirection = WEST;
        if (currentDirection == EAST)
            currentDirection = SOUTH;
        return currentDirection;
    }

    public Direction turnLeft() {
        if (currentDirection == NORTH)
            currentDirection = WEST;
        if (currentDirection == EAST)
            currentDirection = NORTH;
        return currentDirection;
    }

    public void move(int steps) {
        if (currentDirection == EAST) {
        increaseColumnBy(steps);
        }

    }
    private void increaseColumnBy(int steps){
        int currentColumnPosition = currentPosition.getColumn();
        currentPosition.setColumn(currentColumnPosition + steps - 1);
    }

    public Positions getCurrentPosition() {
        return currentPosition;
    }
}
