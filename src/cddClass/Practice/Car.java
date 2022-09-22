package cddClass.Practice;

public class Car extends Vehicle{
    private int doors;
    private int wheels;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, int size,int gears, int doors, int wheels, boolean isManual) {
        super(name, size);
        this.doors = doors;
        this.wheels = wheels;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("current gear changed to "+ this.currentGear );
    }
    public void changeVelocity(int speed, int direction){
        move(speed, direction);
        System.out.println("car changed the velocity "+ speed + " direction " + direction);
    }
    public String getParseInt(String number ){
        String look = number;
        return look;
    }
}
