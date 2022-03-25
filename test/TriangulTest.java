public class TriangulTest {
    public static void main(String... args) {
//            for(int looping = 9; looping >= 0; looping--){
//                for (int column = 0; column <= looping; column++){
//                    System.out.print("* ");
//                }System.out.println();
//        }
        for (int looping = 0; looping <= 9; looping++) {
            for (int column = looping; column <= 9; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int looping = 0; looping <= 9; looping++) {
            for (int column = 0; column <= looping; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int looping = 0; looping <= 9; looping++) {
            for (int column = looping; column <= 9; column++) {
                System.out.print("  ");
            }
            for (int column = 0; column <= looping; column++) {
                System.out.print("* ");
            }
            System.out.println();
            System.out.println();

        }
        for (int looping = 0; looping <= 9; looping++) {
            for (int column = 0; column <= looping; column++) {
                System.out.print("  ");
            }
            for (int column = looping; column <= 9; column++) {
                System.out.print("* ");
            }
            System.out.println();
            System.out.println();
        }
        for (int looping = 0; looping <= 9; looping++) {
            for (int column = looping; column <= 9; column++) {
                System.out.print("  ");
            }
            for (int column = 0; column <= looping; column++) {
                System.out.print("* ");
            }
            for (int column = 0; column < looping; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int looping = 0; looping < 9; looping++) {
            for (int column = looping; column <= 9; column++) {
                System.out.print("  ");
            }
            for (int column = 0; column < looping; column++) {
                System.out.print("* ");
            }
            for (int column = 0; column <= looping; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int looping = 0; looping <= 9; looping++){
            for (int column = 0; column <= looping; column++){
                System.out.print("  ");
            }for (int column = looping; column < 9; column++){
                System.out.print("* ");
            }for (int column = looping; column <=9; column++){
                System.out.print("* ");
            }
            System.out.println();
        }for(int looping = 0; looping <= 9; looping++){
            for (int column = 0; column <= looping; column++){
                System.out.print("  ");
            }for (int column = looping; column < 9; column++){
                System.out.print("* ");
            }for (int column = looping; column <=9; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
