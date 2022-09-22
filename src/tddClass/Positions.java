package tddClass;

public class Positions {
    private int row;
    private int column;

    public Positions(int row, int column) {
        this.row = row;
        this.column = column;
    }
    @Override
    public String toString(){
        return "Position{" + "row = " + row + ", column " +
                "= "+ column+ " }";
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getColumn() {
        return column;
    }
    @Override
    public boolean equals(Object obj){
        Positions compared = (Positions) obj;
        if (compared.column == this.column && compared.row == this.row)
            return true;

        return false;
    }
}
