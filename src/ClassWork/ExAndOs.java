package ClassWork;

public class ExAndOs {
    public static void main (String... args){
       char [][] trios = new char[3][3];
        trios [0][0] = 'X';
        trios [0][1] = 'O';
        System.out.println(trios[0][0]+" "+trios[0][1]);

        trios [1][0] = 'X';
        trios [1][1] = 'O';
        trios [1][2] = 'X';
        System.out.println(trios[1][0]+" "+trios[1][1]+" "+trios[1][2]);

        trios [2][0] = 'O';
        trios [2][1] = 'X';
        trios [2][2] = 'O';
        System.out.println(trios [2][0]+" "+ trios [2][1]+" "+trios [2][2]);

    }
}
