package cddClass.Practice;

public class AirCondition {
    private String manufacturer;
    private String name;
    private String model;

    public AirCondition(String manufacturer, String name, String model) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.model = model;
    }
    public void turningOn(String productName){
        System.out.println(productName + " Turning on...");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }
}
