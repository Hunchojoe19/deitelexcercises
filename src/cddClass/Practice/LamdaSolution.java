package cddClass.Practice;

import java.security.SecureRandom;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class LamdaSolution {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        IntStream stream = random.ints(10, 0, 1001);
        Long evenCount = stream.filter(x -> x % 2 == 0)
                .count();

        Long oddCount = stream.filter(x -> x % 2 ==1)
                .count();

// This is one method to do such, we could use another method below
//        double evenAverage = 0;
//        OptionalDouble optionalDouble = stream.filter(x -> x % 2 == 0).average();
//        if (optionalDouble.isPresent()){
//            evenAverage = optionalDouble.getAsDouble();
//        }
        double evenAverage = stream.filter(x -> x % 2 == 0).average().orElse(0);
        double oddAverage = stream.filter(x -> x % 2 == 1).average().orElse(0);

        double average = stream.average().orElse(0);
    }

}
