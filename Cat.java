package lesson5;

 class Cat extends Animal {

     private  int maxRunLenght = 200;
     private  double maxJumpLenght = 2;

     @Override
     void run(int length) {
         if ((length >= 0) && (length <= maxRunLenght)) System.out.println("Кот побежал! ");
     }

     @Override
     void swim(int length) {
         System.out.println("Коты не умеют плавать! \n");
     }

     @Override
     void jump(double height) {
         if ((height >= 0) && (height <= maxJumpLenght)) System.out.println("кот прыгнул!");

     }




}
