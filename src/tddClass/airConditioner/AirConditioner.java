package tddClass.airConditioner;

import java.sql.SQLOutput;

public class AirConditioner {

    private boolean powerButton;
    private int temperature;
    public AirConditioner () {
        powerButton= false;
        temperature = 16;
    }

    public void setSwitch() {
        if (powerButton) {
            powerButton = false;
        } else {
            powerButton = true;
        }

    }

    public boolean isOn() {
        return powerButton;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {

        if (powerButton) {
            if (temperature < 30) {
                temperature = temperature + 1;
            } else {
                System.out.println("Temperature cannot exceed 30.");
            }
        }
    }


    public void decreaseTemperature() {
        if (powerButton) {
        }if (temperature > 16) {
                temperature = temperature + 1;
            }else {
                System.out.println("The temperature cannot go below 16.");
            }
        }
    }