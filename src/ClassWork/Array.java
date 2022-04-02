package ClassWork;

public class Array {
    public static void main (String... args){
        int[] megas = new int [300];
        for (int count = 0; count < 300; count++ ){

            megas [0] = 1 + count;

            System.out.print(" " +megas[0]);
        }
    }

    public static int findMaximumfrom(int[] scores) {
        if (scores[0] > scores [1] && scores [0] > scores [2] && scores [0] > scores [3] && scores [0] > scores[4])
        return scores[0];
        else if (scores [1] > scores[0] && scores [1] > scores[2]&& scores [1] > scores[3]&& scores [1] > scores[4])
        return scores[1];
        else if (scores [2] > scores[0] && scores [2] > scores[1]&& scores [2] > scores[3]&& scores [2] > scores[4])
        return scores[2];
        else if (scores [3] > scores[0] && scores [3] > scores[1]&& scores [3] > scores[2]&& scores [3] > scores[4])
        return  scores[3];
        else return scores[4];



    }

    public static int findMinimumfrom(int[] scores) {
        if (scores[0] < scores [1] && scores [0] < scores [2] && scores [0] < scores [3] && scores [0] < scores[4])
            return scores[0];
        else if (scores [1] < scores[0] && scores [1] < scores[2]&& scores [1] < scores[3]&& scores [1] < scores[4])
            return scores[1];
        else if (scores [2] < scores[0] && scores [2] < scores[1]&& scores [2] < scores[3]&& scores [2] < scores[4])
            return scores[2];
        else if (scores [3] < scores[0] && scores [3] < scores[1]&& scores [3] < scores[2]&& scores [3] < scores[4])
            return  scores[3];
        else return scores[4];

    }

    public static int sumofArrays(int[] scores) {
       int sum = scores [0]+ scores[1]+ scores [2] + scores[3] + scores[4];
       return sum;

    }

    public static int findAveragefrom(int[] scores) {
        int average = Array.sumofArrays(scores)/ scores.length;
        return average;

    }
}
