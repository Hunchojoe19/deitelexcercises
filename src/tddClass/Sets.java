package tddClass;

public class Sets{
    private JoesArrayLists setters = new JoesArrayLists();
    public boolean isEmpty() {
        if(setters.size() > 0){
            return false;
        }
        return true;
    }
    public boolean isContain(String item) {
        for (int i = 0; i < size(); i++) {
           if(item.equals(setters.get(i))){
               return true;
           }
        }

        return false;
    }
    public void add (int index, String item){
        setters.add(index, item);
    }
    public void add(String item){
        if(!isContain(item)){
            setters.add(item);
        }
    }

    public int size() {
        return setters.size();
    }

    public String get(int index) {
        return setters.get(index);
    }

    public void remove(int index) {
        setters.remove(index);
    }
    public void remove(String item ){
        setters.remove(item);
    }
}
