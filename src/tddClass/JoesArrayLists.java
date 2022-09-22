package tddClass;

public class JoesArrayLists {
    int count = 0;
    private String arrayLists [] = new String[5];

    public void expandArrayList(){
        String [] temp = arrayLists;
        arrayLists = new String [arrayLists.length * 2];

        for (int i = 0; i < temp.length; i++) {
            arrayLists[i] = temp[i];
        }
    }
    public void add(String item) {
        if ((arrayLists.length - 1) == count) {
            expandArrayList();
        }
       arrayLists[count] = item;
       count++;

    }
    public void add(int index, String item) {
        if ((arrayLists.length - 1) == count) {
            expandArrayList();
        }
            arrayLists[index] = item;
//        replaceAdd(index, item);
        count++;
    }

    public String get(int index) {

        return arrayLists[index];
    }

    public void remove(String item) {
        int index = 0;
        arrayLists[count] = item;
        for (int i = arrayLists.length - 1; i <= 0; i--) {
            if (item.equals(arrayLists[i]));
            index = i;
        }
        replaceRemoval(index);
        count--;

    }
    public void remove(int index) {
        for (int i = arrayLists.length - 1; i <= 0; i--) {
            arrayLists[index] = arrayLists[i];
        }
        replaceRemoval(index);
        count --;

    }

    public int size() {

        return count;
    }
//    public void replaceAdd(int index, String item){
//        String[] arrayLists1 = new String [arrayLists.length+1];
//        for (int i = 0; i < arrayLists1.length; i++) {
//            arrayLists[i] = arrayLists1[i];
//        }
//        arrayLists[index] = item;
//        for (int i = index; i < arrayLists1.length - 1; i++) {
//            arrayLists1[index+1] = arrayLists1[index];
//        }
//        arrayLists = arrayLists1;
//    }
    public void replaceRemoval(int index){
        arrayLists[index] = null;
        for (int i = 0; i < arrayLists.length-1; i++) {
            if (arrayLists[i] == null){
                arrayLists[i]= arrayLists[i+1];
                arrayLists[i+1] = null;
            }

        }
    }
}

