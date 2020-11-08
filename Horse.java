package lesson5;

class Horse extends Animal{

    private  int maxRunLenght = 1500;
    private  int maxSwimLenght = 100;
    private  double maxJumpLenght = 3;


    @Override
    void run(int length) {
        if ((length >= 0) && (length <= maxRunLenght)) System.out.println("Лошадь побежала");
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= maxSwimLenght)) System.out.println("Лошадь поплыла! \n");
    }

    @Override
    void jump(double height) {
        if ((height >= 0) && (height <= maxJumpLenght)) System.out.println("Лошадь Подпрыгнула!");
    }

}
