//package tddClass;
//
//public class Car {
//    String model;
//    String yearOfModel;
//    double price;
//    public static int speed;
//    public Car(String model, String yearOfModel, double price){
//        this.price = price;
//        this.yearOfModel = yearOfModel;
//        this.model = model;
//    }
//
//    public boolean isOn(boolean power) {
//        if(!power)
//            return false;
//        return true;
//    }
//
//    public boolean isOff(boolean power) {
//        if (power == true) return true;
//        return false;
//    }
//
//    public static void accelerate(int velocity) {
//
//
//        if (velocity <= 21 && velocity > 0)
//        speed = velocity + 1;
//    }
//    public static int getAccelerate() {
//        return speed;
//    }
//
//    public static void decelerate(int velocity) {
//        speed = velocity - 1;
//    }
//
//    public static int getDecelerate() {
//        return speed;
//    }
//
//    public static void accelerateToGearTwo(int velocity) {
//        speed = velocity + 2;
//    }
//
//    public static int getAccelerateToGearTwo() {
//        return speed;
//    }
//
//    public static int getAccelerateToGearThree() {
//        return speed;
//    }
//
//    public static void accelerateToGearThree(int velocity) {
//        speed = velocity + 3;
//    }
//
//    public static void accelerateToGearFour(int velocity) {
//        speed = velocity + 4;
//    }
//
//    public static int getAccelerateToGearFour() {
//        return speed;
//    }
//}
//
