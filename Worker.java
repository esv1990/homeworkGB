package hw4;

public class Worker {

    String fio, post, email;
    int salary, age;
    int bonus = 5000;

    Worker(String fio, String post, String email, int salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    void getInfo() {
        System.out.println("ФИО: " + fio + " | должность: " + post);
    }

    void getInfoBonus() {
        System.out.println("ФИО: " + fio + " | должность: " + post + " | дополнительно к окладу: " + bonus);
    }

    int newBonus(){
        return salary + bonus;
    }

    int getAge() {
        return age;
    }

}


