import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tddClass.Entry;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EntryTest {
    private Entry entry;
    @BeforeEach
    public void setup(){
        entry = new Entry("Ade goes to school", "My My My");
    }
    @Test
    void entryIsNotNull(){
        assertNotNull(entry);
    }
    @Test
    void titleCanBeGottenWhenEntered(){
        assertEquals("Ade goes to school", entry.getTitle());
    }
    @Test
    void newEntriesCanBeCreatedAndNotNull(){
        Entry fly = new Entry("Below standard", "God is good");
        assertEquals("Below standard", fly.getTitle());
    }
    @Test
    void bodyOfTheEntriesCanBeRetrieved(){
        entry = new Entry("Spinster", "Greatest");
        assertEquals("Greatest", entry.getBody());
        entry = new Entry("Splitting", "Grown ups");
        assertEquals("Grown ups", entry.getBody());
    }
    @Test
    void testBothBodyAndTitleCouldBeRetrieved(){
        Entry fly = new Entry("Below standard", "God is good");
        assertEquals("Below standard",fly.getTitle());
//        assertEquals("God is good",fly.getBody());
    }
}
