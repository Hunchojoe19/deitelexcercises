import org.junit.jupiter.api.Test;
import tddClass.PetrolPurchase;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetrolPurchaseTest {
    @Test
     void toPurchasePetrol(){
    PetrolPurchase fuel = new PetrolPurchase("Abuja", "Null", 0.0, 0, 0.0);
    fuel.setLocation ("Abuja");
    assertEquals("Abuja", fuel.getLocation());
    }
    @Test
    void toPurchaseTypeOfFuel(){
        PetrolPurchase fuel = new PetrolPurchase("Abuja", "Mobil", 0.0, 0, 0.0);
        fuel.setType("Mobil");
        assertEquals("Mobil", fuel.getType());
    }
    @Test
    void toRequestPrice(){
        PetrolPurchase fuel = new PetrolPurchase("Abuja", "Mobil", 12.5, 0, 0.0);
        fuel.setPrice(0.0);
        assertEquals(12.5, fuel.getPrice());
    }
    @Test
    void toGetQuantity(){
        PetrolPurchase fuel = new PetrolPurchase("Null", "Null", 0.0, 18, 0.0);
        fuel.setQuantity(18);
        assertEquals(18, fuel.getQuantity());
    }
    @Test
    void toGetDiscount(){
        PetrolPurchase fuel = new PetrolPurchase("null", "null", 0.0, 0, 40.0);
        fuel.setDiscount(0.0);
        assertEquals(40.0, fuel.getDiscount());
    }
    @Test
    void getPurchaseAmount(){
        PetrolPurchase fuel = new PetrolPurchase("null", "null", 16.2,50,0.18);
        fuel.setPurchaseAmount();
        assertEquals(809.82, fuel.getPurchaseAmount());
    }
}
