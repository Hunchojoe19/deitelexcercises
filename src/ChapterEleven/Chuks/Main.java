package ChapterEleven.Chuks;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 35, 50);
        Case theCase = new Case("A346-23", "HP", dimensions);

        Monitor theMonitor = new Monitor("255B", "Acer", new Resolution(45,60), 67);

        MotherBoard motherBoard = new MotherBoard("BeastMode", "Dell", "ARG345", 56,546);
       PC pC = new PC(theCase, theMonitor, motherBoard);

        pC.powerUp();
        pC.getMotherBoard().loadProgram("Window 5.6");
        }
    }

