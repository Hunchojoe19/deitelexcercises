package ChapterEleven.Chuks;

public class DuplexPrinter {
    private int tonerLevel = 100;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;

    public DuplexPrinter(int tonerLevel, int numberOfPagesPrinted, boolean duplexPrinter) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.numberOfPagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public int tonerFillUp(int addToner) {
        if (addToner > 0 && addToner <= 100){
        if (tonerLevel + addToner > 100){
            System.out.println("Toner level is full, cannot go beyond 100.");
            return -1;
        }
            this.tonerLevel += addToner;
            return tonerLevel;
        }else {
            return -1;
        }
    }

    public int NumberOfPagesPrinted(int pages) {
        int pagesPrinted = pages;
        if (this.duplexPrinter){
        pagesPrinted = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode.");}
        this.numberOfPagesPrinted += pagesPrinted;
        return pagesPrinted;
    }
    public int getNumberOfPagesPrinted(){
        return  numberOfPagesPrinted;
    }
}
