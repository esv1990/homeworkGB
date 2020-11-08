package lesson5;

 class Dog extends Animal {

     private  int maxRunLenght = 500;
     private  int maxSwimLenght = 10;
     private  double maxJumpLenght = 0.5;


     @Override
     void run(int length) {
       if ((length >= 0) && (length <= maxRunLenght)) System.out.println("Песик побежал");

     }

     @Override
     void swim(int length) {
         if ((length >= 0) && (length <= maxSwimLenght)) System.out.println("Песик поплыл! \n");
     }

     @Override
     void jump(double height) {
         if ((height >= 0) && (height <= maxJumpLenght)) System.out.println("Песик Подпрыгнул!");
     }
}
