package tddClass;

public class Queues {
    int elementNumber;
    int count;
    private String [] arrays = new String[5];

    public void push(String item){
        if (count == 5){
            throw new ArrayIndexOutOfBoundsException("Queue is full, come back later");
        }
        arrays[count] = item;
        count++;
    }

    public boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        return false;
    }

    public String pop() {
        String item = arrays[elementNumber];
        arrays[elementNumber] = null;
        elementNumber++;
        return item;
    }
    public String peek() {
        return arrays[count - 1];
    }
}
