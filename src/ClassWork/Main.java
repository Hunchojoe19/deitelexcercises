package ClassWork;
class Car{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
    public String startEngine(){
        return "Car -> startEngine()";
    }
    public String accelerate(){
        return "Car -> accelerate()";
    }
    public String brake (){
        return "Car -> brake()";
    }
}
class Porsche extends Car {
        public Porsche(String name, int cylinders) {
            super(name, cylinders);
        }

        @Override
        public String startEngine() {
            return "Porsche -> startEngine()";
        }

        @Override
        public String accelerate() {
            return "Porsche -> accelerate()";
        }

        @Override
        public String brake() {
            return "Porsche -> brake()";
        }
    }
class Toyota extends Car {
    public Toyota(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Toyota -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Toyota -> accelerate()";
    }

    @Override
    public String brake() {
        return "Toyota -> brake()";
    }
}
class Tesla extends Car{
        public Tesla(String name, int cylinders) {
            super(name, cylinders);
        }

        @Override
        public String startEngine() {
            return "Tesla -> startEngine()";
        }

        @Override
        public String accelerate() {
            return "Tesla -> accelerate()";
        }

        @Override
        public String brake() {
            return "Tesla -> brake()";
        }
    }

public class Main {
    public static void main(String[] args) {
    Car car = new Car("BMW XG56", 6);
        System.out.println(car.accelerate());
        System.out.println(car.startEngine());
        System.out.println(car.brake());
        System.out.println();
        Toyota toyota = new Toyota("Toyota GLX 4WD", 6);
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.brake());
    }
}
