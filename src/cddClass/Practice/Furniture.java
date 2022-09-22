package cddClass.Practice;

public class Furniture {
    private Chair chair;
    private Table tables;
    private Bed beddings;
    private String manufacturer;


    public Furniture(Chair chair, Table tables, Bed beddings, String manufacturer) {
        this.chair = chair;
        this.tables = tables;
        this.beddings = beddings;
        this.manufacturer = manufacturer;

    }

    public Chair getChair() {
        return chair;
    }

    public Table getTables() {
        return tables;
    }

    public Bed getBeddings() {
        return beddings;
    }

    public String getManufacturer() {
        return manufacturer;
    }

}
