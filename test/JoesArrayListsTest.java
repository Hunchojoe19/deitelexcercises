import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tddClass.JoesArrayLists;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class JoesArrayListsTest {
    private JoesArrayLists arrayList;
    @BeforeEach
    public void setup(){
        arrayList = new JoesArrayLists();
    }
    @Test
    void arrayListIsNotVoidTest(){
        assertNotNull(arrayList);
    }
    @Test
    void arrayListCanAddItemTest(){
        arrayList.add("Sweet");
        assertEquals(1, arrayList.size());
    }
    @Test
    void arrayListCanBeRemovedTest(){
        arrayList.add("Books");
        arrayList.add("Biro");
        arrayList.remove("Biro");
        assertEquals(1,arrayList.size());
    }
    @Test
    void arrayListCanBeAddedAndGottenWithIndex(){
        arrayList.add(0, "Book");
        arrayList.add(1, "Blue biro");
        arrayList.add(2, "Yellow Bag");
        assertEquals("Blue biro", arrayList.get(1));
    }
    @Test
    void arrayListCanBeRemovedByIndexAndItemTest(){
        arrayList.add(0, "Book");
        arrayList.add(1, "Blue Book");
        arrayList.add(2, "Brown Biro");
        arrayList.add(3, "Yellow Bag");
        arrayList.remove(2);
        assertEquals(3, arrayList.size());
    }
    @Test
    void arrayListCanBeExpandedWhenFullTest(){
        arrayList.add(0, "Book");
        arrayList.add(1, "Blue Book");
        arrayList.add(2, "Brown Biro");
        arrayList.add(3, "Yellow Bag");
        arrayList.add(4, "Yellow Bag");
        arrayList.add(5, "Yellow Bag");
        assertEquals(6, arrayList.size());
    }
    @Test
    void arrayListCanBeRemovedByIndexTest(){
        arrayList.add("GoodMans");
        arrayList.add("Golden Morn");
        arrayList.add("Boiled Egg");
        arrayList.remove(1);
        assertEquals("Boiled Egg", arrayList.get(1));
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

        }
    }
}
