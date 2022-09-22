package tddClass;


import java.util.ArrayList;

public class Diary {
    private ArrayList<Entry> diary;
    private String userName;
    private String password;
    private String email;
    private boolean isLock;

    public Diary(String userName, String password, String email, boolean isLock) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.diary = new ArrayList<Entry>();
        this.isLock = isLock;
    }public Entry entryCanBeCreated(String title, String body){
        return new Entry(title,body);
    }
    public void addEntries(Entry entries) {
        diary.add(entries);
    }

    public int getEntries() {
        return diary.size();
    }

    public void deleteEntries(Entry entry) {
        diary.remove(entry);
    }

    public boolean updateEntries(Entry oldTitle, Entry newTitle) {
        int foundPosition = searchEntries(oldTitle);
        if (foundPosition < 0) {
            System.out.println(oldTitle.getTitle()+ ", is not found");
            return false;
        }
        this.diary.set(foundPosition, newTitle);
        System.out.println("The entry with title "+ oldTitle.getTitle() + " has been modified to "+newTitle.getTitle());
        return true;
    }
    public void printEntriesInDiary(){
        System.out.println("You have "+ diary.size()+ " Entries in your diary.");
        for (int i = 0; i < diary.size(); i++) {
            Entry entry = diary.get(i);
            System.out.println((i+1) +". "+ entry.getTitle());
        }
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public boolean isLock() {
        System.out.println("Diary is locked");
        return isLock;
    }

    private int searchEntries(Entry heading) {
        return this.diary.indexOf(heading);
    }
    public  Entry searchEntries(String title){
        for (int i = 0; i < this.diary.size(); i++) {
            Entry heading = this.diary.get(i);
            if (heading.getTitle().equalsIgnoreCase(title)) {
                return heading;
            }
        }
        return null;
    }
    public String setPassword(){
        return this.password;
    }
}
