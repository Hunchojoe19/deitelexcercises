package cddClass.Practice;

public class ArrayLists implements List{
    private int count;
    private String [] loaded = new String[5];


    private void resizedArray() {
        String[] original = loaded;

        loaded = new String[20];
        for (int i = 0; i < original.length; i++) {
            loaded[i] = original[i];
        }
    }
    @Override
    public void add(String Item) {
       if ((loaded.length - 1) == count) {
            resizedArray();
        }
        loaded[count] = Item;
        count++;

    }
    @Override
    public void add(int index, String Item) {
        loaded[index] = Item;

    }

    @Override
    public String get(int index) {
        return loaded[index];
    }

    @Override
    public void remove(String Item) {
        count--;

    }

    @Override
    public void remove(int index) {
        for (int i = loaded.length - 1; i <= 0; i--) {
            loaded[index] = loaded[i];

        }

    }

    @Override
    public int size() {
        return count;
    }

}
