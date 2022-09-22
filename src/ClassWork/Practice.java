package ClassWork;

public class Practice {
    public static void main(String[] args) {
//        int count = 0;
//        int sum = 0;
//        int number = 1000;
//        for(int i = 1; i <= number; i++){
//           if((i % 3 == 0)&& (i%5==0)){
//               count++;
//               sum +=i;
//               System.out.println(i);
//           }
//           if (count == 5){
//               break;
//           }
//        }
//        System.out.println("sum is "+ sum);
        int numbers = 1;
        int count = 0;
        int finishedNumbers = 20;
        while (numbers <= finishedNumbers) {
            numbers++;

            if (!isEvenNumber(numbers)) {
                continue;
            }
            System.out.println("Even numbers are " + numbers);
            count++;
            if (count >= 5) {
                break;
            }

        }
        System.out.println("Even numbers are: "+ count);
    }
    public static boolean isEvenNumber(int number){
        if (number % 2 ==0)return true;
        else{return false;}
    }
}
