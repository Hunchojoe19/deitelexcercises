package tddClass.autoBike;

public class Bike {
    private boolean power;
    public int speed;

    public void setButton() {
        if (power) {
            power = false;
        } else {
            power = true;
        }

    }

    public boolean isOn() {
        return power;
    }

    public void accelerate() {
    if (speed <= 20) speed = speed + 1;
    else if (speed >= 20 && speed <= 30) {speed = speed + 2;}
    else if (speed >= 30 && speed <= 40) {speed = speed + 3;}
    else {speed = speed + 4;}
    }
    public int getAccelerate() {
        return speed;
    }
}


