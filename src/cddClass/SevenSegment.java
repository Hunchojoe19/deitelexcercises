package cddClass;

public class SevenSegment {


    static String [][] sevenSegmentArray = new String[5][4];

        public static void setA() {
            for (int row = 0; row <= 0; row++) {
                for (int column = 0; column <= 3 ; column++) {
                    sevenSegmentArray[row][column] = "$";

                }
            }
        }
        public static void setB(){
            for (int row = 0; row <= 2 ; row++) {
                for (int column = 3; column <=3 ; column++) {
                    sevenSegmentArray[row][column] = "$";

                }

            }
        }
        public static void setC(){
            for (int row = 2; row <=4 ; row++) {
                for (int column = 3; column <= 3 ; column++) {
                    sevenSegmentArray[row][column] = "$";
                }
            }
        }
        public static void setD(){
            for (int row = 4; row <= 4; row++) {
                for (int column = 0; column <= 3; column++) {
                    sevenSegmentArray[row][column] = "$";
                }

            }
        }
        public static void setE(){
            for (int row = 2; row <= 4 ; row++) {
                for (int column = 0; column <= 0; column++) {
                    sevenSegmentArray[row][column] = "$";

                }

            }
        }
        public static void setF(){
            for (int row = 0; row <= 2; row++) {
                for (int column = 0; column <= 0; column++) {
                    sevenSegmentArray[row][column] = "$";

                }

            }
        }
        public static void setG(){
            for (int row = 2; row <= 2; row++) {
                for (int column = 0; column <= 3; column++) {
                    sevenSegmentArray[row][column] = "$";

                }

            }
        }
        public static void resetScreen (String reset){
            for (int row = 0; row <= 4; row++) {
                for (int column = 0; column <= 3; column++) {
                    sevenSegmentArray[row][column] = " ";
            }
        }

        if (reset.charAt(7) == '1') {
            if (reset.charAt(0) == '1')
                setA();
            if (reset.charAt(1) == '1')
                setB();
            if (reset.charAt(2) == '1')
                setC();
            if (reset.charAt(3) == '1')
                setD();
            if (reset.charAt(4) == '1')
                setE();
            if (reset.charAt(5) == '1')
                setF();
            if (reset.charAt(6) == '1')
                setG();
            }
        }


        public static void display () {
            for (int row = 0; row <= 4; row++) {
                for (int column = 0; column <= 3; column++) {
                    System.out.print(sevenSegmentArray[row][column] + " ");
                }
                System.out.println();
            }
        }
}
