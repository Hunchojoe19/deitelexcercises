package cddClass.Practice;

public class PapaNosa {
    private Pray pray;
    private Walk walk;

    public PapaNosa(Pray pray, Walk walk) {
        this.pray = pray;
        this.walk = walk;
    }
    public void pray (){
        this.pray.pray();
    }

    public void setAdura(Pray pray) {
        this.pray = pray;
    }

    public void walk() {

        this.walk.walk();
    }
}
