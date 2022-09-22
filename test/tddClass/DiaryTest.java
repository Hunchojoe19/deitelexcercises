package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryTest {
    private Diary diary;

    @BeforeEach
    public void setup() {
        diary = new Diary("Huncho", "Goodwill@1234", "Huncho@gmail.com", true);
    }

    @Test
    void diaryIsNotNullTest() {
        assertNotNull(diary);
    }

    @Test
    void entriesCanBeCreatedTest() {
        Entry entries = new Entry("Body gang", "Look into the skies");
        assertEquals(1, entries.getEntries(1));
    }

    @Test
    void diaryCanHaveAnEntryTest() {
        Entry entry = new Entry("Good life", "Life is great");
        diary.addEntries(entry);
        assertEquals(1, diary.getEntries());
    }

    @Test
    void entriesCanBeAddedInTheDiaryTest() {
        Entry entry = new Entry("Good life", "Life is great");
        Entry entries1 = new Entry("God is good", "Meet you at home");
        Entry entries2 = new Entry("God is good", "Meet you at home");
        diary.addEntries(entry);
        diary.addEntries(entries1);
        diary.addEntries(entries2);
        assertEquals(3, diary.getEntries());
    }
    @Test
    void entriesCanBeDeletedFromDiaryTest(){
        Entry entry = new Entry("Good life", "Life is great");
        Entry entries1 = new Entry("God is good", "Meet you at home");
        Entry entries2 = new Entry("God is good all the time", "Meet you at home");
        diary.addEntries(entry);
        diary.addEntries(entries1);
        diary.addEntries(entries2);
        diary.deleteEntries(entries1);
        assertEquals(2, diary.getEntries());
    }
    @Test
    void entriesCanBeUpdatedTest(){
        Entry entry = new Entry("Good life", "Life is great");
        Entry entries1 = new Entry("God is good", "Meet you at home");
        diary.addEntries(entry);
        diary.addEntries(entries1);
        Entry entries2 = new Entry("Baba God", "Thunder");
        assertEquals(true, diary.updateEntries(entry,entries2));
    }
    @Test
    void entriesCanBeSearchedTest(){
        Entry entry = new Entry("Good life", "Life is great");
        Entry entries1 = new Entry("God is good", "Meet you at home");
        diary.addEntries(entry);
        diary.addEntries(entries1);
        Entry findEntry =diary.searchEntries("God is good");
        assertNotNull(findEntry);
    }

}
