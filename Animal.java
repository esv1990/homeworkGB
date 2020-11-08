package lesson5;

 abstract class Animal {

    protected int maxRunLenght ;
    protected int maxSwimLenght;
    protected double maxJumpLenght ;

    abstract void run(int length);

    abstract void swim(int length);

    abstract void jump(double height);

}
