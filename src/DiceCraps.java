import java.util.Random;

public class DiceCraps {
    public static void main(String[] args) {

        //if you throw 2 dice and the sum of the spots is 7 or 11 on first throw you win
        //if you throw 2 dice and the sum of the spots is 2,3, or 12 on first throw you lose
        //if you throw 2 dice and the sum of the spots is 4,5,6,8,9 or 10 on first throw it becomes "your point"
        //if you have the same number of values, you "make your point", you lose by making a 7 before making your point

        Random number1 = new Random();
        Random number2 = new Random();

        int die1 = 1+number1.nextInt(6);
        int die2 = 1+number2.nextInt(6);

        if((die1 + die2 == 7) || (die1 + die2 == 11)){
            System.out.println(die1 + die2);
            System.out.println("You win");
        }
        if ((die1 + die2 == 2) || (die1 + die2 == 3) || (die1 + die2 == 12)){
            System.out.println(die1 + die2);
            System.out.println("You lose");
        }
        if ((die1 + die2 == 4) || (die1 + die2 == 5) || (die1 + die2 == 6) || (die1 + die2 == 8) || (die1 + die2 == 9)
                || (die1 + die2 == 10)){
            int point = die1 + die2;
            System.out.println(die1 + die2);
            System.out.println("point");
            die1 = 1+number1.nextInt(6);
            die2 = 1+number2.nextInt(6);
        int userOutput = die1 + die2;
            if (point == userOutput ){
                if (userOutput != 7){
                    System.out.println("You win");
                }
            }else {
                System.out.println("You lose");
            }
        }
    }
}
