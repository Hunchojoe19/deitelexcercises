package cddClass;

public class Arrays {
    public static void main (String... args){
        char [][] exes = new char[3][3];
        exes[0][0] =    'X';
        exes[0][1] =    'O';
        exes[0][2] =    'X';
        exes[1][0] =    'X';
        exes[1][1] =    'X';
        exes[1][2] =    'X';
        exes[2][0] =    'O';
        exes[2][1] =    'X';
        exes[2][2] =    'O';

        System.out.println(exes[0][0]+ " " +exes[0][1]+ " " +exes[0][2]);
        System.out.println(exes[1][0]+ " " +exes[1][1]+ " " +exes[1][2]);
        System.out.println(exes[2][0]+ " " +exes[2][1]+ " " +exes[2][2]);




    }
}
