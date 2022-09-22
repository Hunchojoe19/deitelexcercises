package ChapterEleven.Chuks;

public class Monitor {
    private String model;
    private String manufacturer;
    private Resolution resolution;
    private int size;

    public Monitor(String model, String manufacturer, Resolution resolution, int size) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.resolution = resolution;
        this.size = size;
    }
    public void drawPixelAt(int x, int y, String colour){
        System.out.println("Drawing pixel at "+ x + ","+ y + " in colour "+ colour);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public int getSize() {
        return size;
    }
}
