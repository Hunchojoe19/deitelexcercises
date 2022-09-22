package cddClass;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("The sum of the digit of the given number is: "+sumDigits(3456));

    }
    public static int sumDigits(int number){
        if (number < 10){
            return -1;
        }
        int sum = 0;
        for (int i = 0; number > i;){
            int digits = number % 10;
            sum += digits;

            number /= 10;
        }
    return sum;}
}
