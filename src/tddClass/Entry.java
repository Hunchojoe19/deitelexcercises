package tddClass;

import java.time.LocalDateTime;

public class Entry {
    private String title;
    private String body;
    private LocalDateTime date;

    public Entry(String title, String body) {
        this.title = title;
        this.body = body;
        date = LocalDateTime.now();
    }

    public String getTitle() {

        return this.title;
    }

    public String getBody() {
        return this.body;
    }

    public int getEntries(int entry) {
        return entry;
    }
    public static Entry createEntry(String title, String body){
        return new Entry(title, body);
    }
}
