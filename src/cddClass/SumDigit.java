package cddClass;

public class SumDigit {
    public static void main(String[] args) {
        System.out.println("The sum of the digit of the given number is: " + sumDigits(6));

        }

        public static int sumDigits(int number) {
        if (number < 10){
            return number;
        }
        while (number/10 > 0) {
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                sum += digit;
                number = number / 10;
            }
            number = sum;
        }
        return number;
    }

}
