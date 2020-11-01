package hw4;

public class Main {



    public static void main(String[] args) {


        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Ivanov Ivan", "manager" , "ivan@mail.ru",
                150000, 45);
        workers[1] = new Worker("Petrov Petr", "manager", "petrovp@mail.me", 50000
                ,30);
        workers[2] = new Worker("Sidorov Sidor", "manager", "sidorovss@mail.me",
                35000, 25);
        workers[3] = new Worker("Sergey Elistratov","manager" , "SERGSERG081990@YANDEX.RU",
                650000, 41);
        workers[4] = new Worker("Gorbunova Alice", "manager", "Gorbunova_Alice@yandex.ru",
                300000 , 23);

        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getAge() > 40){
                workers[i].getInfo();
            }
        }

        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getAge() >= 45) {
                workers[i].getInfoBonus();
                System.out.println(" Оклад с учетом премии будет равен " + workers[i].newBonus());
            }


        }
    }
}
