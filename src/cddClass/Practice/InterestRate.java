package cddClass.Practice;

public class InterestRate {
    public static void main(String[] args) {
        for (int i = 2; i < 9; i++) {
            System.out.println("for an interest rate of "+ i+ " the interest is "+String.format("%.1f",calculateInterest(10000, i)));
        }

    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}
