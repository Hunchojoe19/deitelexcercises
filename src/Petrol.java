import java.util.Scanner;

public class Petrol {
    String location;
    String petrolType;
    int  quantity;
    double pricePerLitre;
    double percentageDiscount;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quantity: ");
        int quantity = scanner.nextInt();
        System.out.println("Enter the price per liter: ");
        double pricePerLiter = scanner.nextDouble();
        System.out.println("Enter the discount: ");
        double percentageDiscount = scanner.nextDouble();
        double discount = percentageDiscount/100;


        System.out.println("The net amount is "+getPurchaseAmount(quantity, pricePerLiter, discount));
    }

    public Petrol(String location, String petrolType, int quantity, double pricePerLitre, double percentageDiscount) {
        this.location = location;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount;
    }

    public String getLocation() {
        return location;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }
    public static double getPurchaseAmount(int quantity, double pricePerLitre, double percentageDiscount){
        double netAmount = (quantity * pricePerLitre) - percentageDiscount;
        return netAmount;

    }


}
