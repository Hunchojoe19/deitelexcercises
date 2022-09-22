package cddClass.Practice;

public class Light {
    private String manufacturer;
    private String name;
    private String model;

    public Light(String manufacturer, String name, String model) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.model = model;
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
