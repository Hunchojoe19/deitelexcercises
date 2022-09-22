package tddClass;

public class Stacks {
    private int count;
    int [] arrays = new int[5];

    public boolean isEmpty(){
        if (count == 0){
            return true;
        }
        return false;
    }

    public void push(int item) {
        arrays[count] = item;
        count++;
    }

    public int pop() {
        count--;
       return arrays[count];
    }

    public int peek() {
        count--;
        return arrays[count];

    }
}
