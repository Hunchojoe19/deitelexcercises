package cddClass.Practice;

public class Vehicle {
    private String name;
    private int size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, int size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }
    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("steering at "+ currentDirection +" degrees.");
    }
    public void move(int velocity, int direction){
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("Vehicle moving at "+ currentVelocity + " velocity" + " in the direction "+ currentDirection);

    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
    public void stop(){
        this.currentVelocity = 0;
    }
}
