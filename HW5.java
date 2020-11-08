package lesson5;

public class HW5 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Horse horse = new Horse();
        Bird bird = new Bird();


        dog.run(499);
        dog.jump(0.5);
        dog.swim(8);

        cat.run(100);
        cat.jump(1.5);
        cat.swim(0);

        horse.run(1500);
        horse.jump(3);
        horse.swim(100);

        bird.run(5);
        bird.jump(0.2);
        bird.swim(0);


    }
}
