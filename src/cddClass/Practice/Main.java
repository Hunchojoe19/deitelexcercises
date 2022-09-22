package cddClass.Practice;

import ChapterEleven.Chuks.DuplexPrinter;

public class Main {
    public static void main(String[] args) {
//        Chair chair = new Chair(35, 45);
//        Table table = new Table(30, 34);
//        Bed beddings = new Bed(56, 45, 433);
//
//        Furniture theFurniture = new Furniture(chair, table, beddings, "Goodnews");
//
//        Light bulb = new Light("Joe Lighting", "Huncho", "342Hb-Blue");
//        Fan fans = new Fan("Ox", "Huncho", "4-Blades");
//        AirCondition ac = new AirCondition("Samsung", "Daniel", "AC34567");
//        Electrical electrical = new Electrical(bulb, fans, ac, "Youang");
//
//        Doors doors = new Doors(45, 56, 600);
//
//        ac.turningOn("Samsung");
        DuplexPrinter printer = new DuplexPrinter(60, 5, false);
        System.out.println("The initial number of pages printed = "+ printer.getNumberOfPagesPrinted());
        int pagesPrinted = printer.NumberOfPagesPrinted(5);
        System.out.println("The final number of pages printed was = "+ pagesPrinted + " new total printed pages are "+ printer.getNumberOfPagesPrinted());

        DuplexPrinter samsung = new DuplexPrinter(100, 12, false);
        System.out.println("The initial number of pages printed = "+ printer.getNumberOfPagesPrinted());
        pagesPrinted = printer.NumberOfPagesPrinted(12);
        System.out.println("The final number of pages printed was = "+ pagesPrinted + " new total printed pages are "+ printer.getNumberOfPagesPrinted());
//        Car car = new Car("Go",4,4,5,4,false);
//        System.out.println(car.getParseInt(String.valueOf(Integer.parseInt("34", 6))));
        }
    }
