package Kata;

public class Kata {
    int totalPrice;
    String name;
    //public boolean enterNumber(int fiveDigits) {int mod1 = fiveDigits%10; int mod2 = fiveDigits%100/10;
    // int mod3 = fiveDigits%1000/100; int mod4 = fiveDigits%10000/1000;int mod5 = fiveDigits%100000/10000;

    //  if (mod1 == mod5)  if (mod2 == mod4) return  true;
    // return false;

    public int enterNumberOfCopies(int numberOfCopies) {
        if (numberOfCopies > 0 && numberOfCopies < 4) {
            totalPrice = numberOfCopies * 2000;
        } else if (numberOfCopies > 5 && numberOfCopies < 9) {
            totalPrice = numberOfCopies * 1800;
        } else if (numberOfCopies > 10 && numberOfCopies < 29) {
            totalPrice = numberOfCopies * 1600;
        } else if (numberOfCopies > 30 && numberOfCopies < 49) {
            totalPrice = numberOfCopies * 1500;
        } else if (numberOfCopies > 50 && numberOfCopies < 99) {
            totalPrice = numberOfCopies * 1300;
        } else if (numberOfCopies > 100 && numberOfCopies < 199) {
            totalPrice = numberOfCopies * 1200;
        } else if (numberOfCopies > 200 && numberOfCopies < 499) {
            totalPrice = numberOfCopies * 1100;
        } else if (numberOfCopies >= 500) {
            totalPrice = numberOfCopies * 1000;
        }return totalPrice;
    }

    public int enterTwoNumbers(int number1, int number2) {
       int quotient = number1 / number2;
        return quotient;
    }

    public String reverse() {
        return name;
    }
}