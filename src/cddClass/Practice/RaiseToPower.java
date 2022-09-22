package cddClass.Practice;

public class RaiseToPower {
    public static void main(String[] args) {
        int answer = 1;
        int frequency;
        for (frequency = 0; frequency < 10; frequency++) {
            answer *= 2;
        }
        System.out.println("Frequency of "+frequency+" will give an answer of "+answer);
    }
}
