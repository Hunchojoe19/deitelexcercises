package cddClass.Practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListsTest {
    private List list;
            @BeforeEach
            public void setup(){
                list = new ArrayLists();
            }
            @Test
    void itemCanBeAdded(){
                list.add("Gucci Bag");
                assertEquals(1, list.size());
            }
            @Test
    void itemCanBeRemoved(){
                list.add("Make-up Box");
                list.add("Brown Bag");
                assertEquals(2, list.size());
                list.remove("Make-up Box");
                assertEquals(1, list.size());
            }
            @Test
    void validateItemsCanBeAddedAndGotten(){
                list.add("Brown Belt");
                list.add("Gucci Bag");
                assertEquals("Gucci Bag", list.get(1));
                assertEquals("Brown Belt", list.get(0));
            }
            @Test
    void arrayListCanBeExpandedIfFull(){
                list.add("Blue Hair");
                list.add("Yellow Bag");
                list.add("Gucci Shoe");
                list.add("Digestive Biscuit");
                list.add("Washing Machine");
                list.add("Mum's Bag");
                list.add("Mum's Hair");
                assertEquals("Mum's Bag",list.get(5));
                assertEquals("Mum's Hair",list.get(6));
            }
            @Test
    void itemsCouldBeAddedAndGottenByTheirIndex(){
                list.add(0, "Shoe lace");
                list.add(1, "Yellow bag");
                assertEquals("Yellow bag", list.get(1));
            }
            @Test
    void itemsCanBeRemovedByTheirIndex(){
                list.add(0,"Shoe lace");
                list.add(1,"Blue shoe");
                list.add(2,"Black shoe");
                assertEquals("Black shoe", list.get(2));
                list.remove(2);
                assertEquals("Blue shoe", list.get(1));
            }
}