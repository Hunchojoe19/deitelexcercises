package cddClass.Practice;

public class Outlander extends Car{
    private int roadService;

    public Outlander(int roadService) {
        super("Outlander", 3, 5, 5, 6, false);
        this.roadService = roadService;
    }
    public void accelerate (int rate){
        //rate is the difference between the initial speed and the current speed
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();// this prompts the car to stop
            changGear(1);// once the car stops, we want to make sure the car automatically enters gear one...
        }
        else if (newVelocity > 0 && newVelocity <= 10){
            changGear(1);
        }
        else if (newVelocity > 10 && newVelocity <= 20){
            changGear(2);
        }
        else if (newVelocity > 20 && newVelocity <= 30){
            changGear(3);
        }
        else {changGear(4);
        }
        if (newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }

}
