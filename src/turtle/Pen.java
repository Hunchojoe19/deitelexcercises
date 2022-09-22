package turtle;

public class Pen {
    private boolean isDown;

    public boolean isDown() {
        return isDown;
    }
    public void penUp(){
        isDown = false;
    }
    public void penDown(){
        isDown = true;
    }
}
