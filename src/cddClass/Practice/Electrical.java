package cddClass.Practice;

public class Electrical {
    private Light bulb;
    private Fan fans;
    private AirCondition ac;


    public Electrical(Light bulb, Fan fans, AirCondition ac, String manufacturer) {
        this.bulb = bulb;
        this.fans = fans;
        this.ac = ac;

    }

    public Light getBulb() {
        return bulb;
    }

    public Fan getFans() {
        return fans;
    }

    public AirCondition getAc() {
        return ac;
    }

}
