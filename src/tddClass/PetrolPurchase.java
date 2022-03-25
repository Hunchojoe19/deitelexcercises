package tddClass;

public class PetrolPurchase {
    String location;
    String typeOfPetrol;
    double price;
    int quantity;
    double percentageDiscount;
    double purchaseAmount;
    public PetrolPurchase(String location, String typeOfPetrol, double price, int quantity, double percentageDiscount){
            this.location = location;
            this.typeOfPetrol = typeOfPetrol;
            this.price = price;
            this.quantity = quantity;
            this.percentageDiscount = percentageDiscount;


    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setType(String type) {
        this.typeOfPetrol = typeOfPetrol;
    }

    public String getType() {
        return typeOfPetrol;
    }

    public void setPrice(double amount) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setDiscount(double discount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getDiscount() {
        return percentageDiscount;
    }

    public void setPurchaseAmount() {

        purchaseAmount = (price * quantity) - percentageDiscount;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }
}
