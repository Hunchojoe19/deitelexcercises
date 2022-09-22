package cddClass.Practice;

public interface List {
    void add(String Item);
    void add(int Index, String Item);
    String get(int Index);
    void remove(String Item);
    void remove(int Index);
    int size();

}
