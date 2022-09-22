package cddClass.Practice;

class Hamburger {
    private String name;
    private String breadRollType;
    private double price;
    private String meat;

    private String addition1name;
    private double addition1amount;

    private String addition2name;
    private double addition2amount;

    private String addition3name;
    private double addition3amount;

    private String addition4name;
    private double addition4amount;

    public Hamburger(String name, String breadRollType, double price, String meat) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.price = price;
        this.meat = meat;
    }

    public void additions1ToBurger(String name, double amount) {
        this.addition1name = name;
        this.addition1amount = amount;

    }

    public void additions2ToBurger(String name, double amount) {
        this.addition2name = name;
        this.addition2amount = amount;

    }

    public void additions3ToBurger(String name, double amount) {
        this.addition3name = name;
        this.addition3amount = amount;

    }

    public void additions4ToBurger(String name, double amount) {
        this.addition4name = name;
        this.addition4amount = amount;

    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a bread roll "
                + this.breadRollType + " with " + this.meat + " costs " + this.price);
        if (addition1name != null) {
            hamburgerPrice += addition1amount;
            System.out.println("Added " + this.addition1name + " to " + this.name + " hamburger "
                    + " the total costs is " + hamburgerPrice);
        }
        if (addition2name != null) {
            hamburgerPrice += addition2amount;
            System.out.println("Added " + this.addition2name + " to " + this.name + " hamburger "
                    + " the total costs is " + hamburgerPrice);
        }
        if (addition3name != null) {
            hamburgerPrice += addition3amount;
            System.out.println("Added " + this.addition3name + " to " + this.name + " hamburger "
                    + " the total costs is " + hamburgerPrice);
        }
        if (addition4name != null) {
            hamburgerPrice += addition4amount;
            System.out.println("Added " + this.addition4name + " to " + this.name + " hamburger "
                    + " the total costs is " + hamburgerPrice);
        }
        return hamburgerPrice;
    }
}
class HealthyHamburger extends Hamburger {

        private String additionName5;
        private double additionAmount5;

        private String additionName6;
        private double additionAmount6;

     public HealthyHamburger(double price, String meat) {
         super("Healthy", "Brown rye roll type", price, meat);
     }
     public void addition5(String name, double amount){
         additionName5 = name;
         additionAmount5 = amount;
     }
     public void addition6(String name, double amount){
         additionName6 = name;
         additionAmount6 = amount;
     }

     @Override
     public double itemizeHamburger() {
         double hamburgerPrice = super.itemizeHamburger();
         if (additionName5 != null){
             hamburgerPrice += additionAmount5;
             System.out.println("Added "+ this.additionName5 +" for an extra "+this.additionAmount5);
         }
         if (additionName6 != null){
             hamburgerPrice += additionAmount6;
             System.out.println("Added "+ this.additionName6 +" for an extra "+this.additionAmount6);
         }
         return hamburgerPrice;
     }
 }
class DeluxeHamburger extends Hamburger{
    @Override
    public void additions1ToBurger(String name, double amount) {
        System.out.println("Cannot add any additions");
    }

    @Override
    public void additions2ToBurger(String name, double amount) {
        System.out.println("Cannot add any additions");
    }

    @Override
    public void additions3ToBurger(String name, double amount) {
        System.out.println("Cannot add any additions");
    }

    @Override
    public void additions4ToBurger(String name, double amount) {
        System.out.println("Cannot add any additions");
    }

    public DeluxeHamburger() {
        super("Deluxe", "White", 5.89, "Sausage & Bacon");
        super.additions1ToBurger("Chips", 2.45);
        super.additions2ToBurger("Drinks", 1.75);

    }
}
public class BurgerMain {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Buddies", "Brown", 5.6, "Hot dog");
        double price = hamburger.itemizeHamburger();
        hamburger.additions1ToBurger("Lettuce", 2.4);
        hamburger.additions2ToBurger("carrot", 1.3);
        hamburger.additions3ToBurger("Sugar", 0.2);
        hamburger.additions4ToBurger("Green Leaf", 0.75);
        System.out.println("Total amount of all the additions to the hamburger is "+price+ "$");

        HealthyHamburger healthy = new HealthyHamburger(5.67,"Ham");
        healthy.addition5("Egg", 3.56);
        healthy.addition6("coconut", 4.75);
        System.out.println("Total Healthy Burger Price is "+ healthy.itemizeHamburger()+"$");

        DeluxeHamburger deluxe = new DeluxeHamburger();
        deluxe.additions3ToBurger("Should not do this", 5.54);
        deluxe.itemizeHamburger();
    }
}
