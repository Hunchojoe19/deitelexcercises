package cddClass.Practice;

public class MainAnimal {
    public static void main(String[] args) {
        Animal [] animals = new Animal[5];
        animals[0] = new Rat();
        animals[1]= new Chicken();
        animals[2] = new Rabbit();
        animals[3] = new Animal();
        animals [4] = new Rabbit();

        for (Animal animal: animals ){
            animal.iCanMove();
        }
        Rabbit rabbit1 = new Rabbit();
        rabbit1.chew();

        Animal rabbit = new Rabbit();
        rabbit.iCanMove();

        Chicken eggy = new Chicken();
        eggy.sucking();
        System.out.println();
            Animal e = new Chicken();
            e.iCanMove();


    }
}