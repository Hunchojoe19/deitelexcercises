package ChapterEleven.Chuks;

public class PC {
    private Case theCase;
    private Monitor theMonitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor theMonitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.motherBoard = motherBoard;
    }
    public void powerUp(){
        theCase.powerButtonPressed();
        drawLogo();
    }
    private void drawLogo(){
        theMonitor.drawPixelAt(3500, 560, "Purple");
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getTheMonitor() {
        return theMonitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
}
