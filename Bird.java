package lesson5;

 class Bird extends Animal{

     private  int maxRunLenght = 5;
     private  double maxJumpLenght = 0.2;

     @Override
     void run(int length) {
         if ((length >= 0) && (length <= maxRunLenght)) System.out.println("Птица побежала! ");
     }

     @Override
     void swim(int length) {
         System.out.println("Птицы не умеют плавать! \n");
     }

     @Override
     void jump(double height) {
         if ((height >= 0) && (height <= maxJumpLenght)) System.out.println("Птица прыгнула!");

     }


}
