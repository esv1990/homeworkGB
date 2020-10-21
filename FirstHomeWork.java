package lesson1;

public class FirstHomeWork {

    public static void main(String[] args) {
        //создал переменные
//        int intA = 1990;
//        long longA = 200000000L;
//        byte byteA = -70;
//        short shortA = 32766;
//
//        double doubleA = -123.3d;
//        float floatA = 12.23f;
//
//        char ch1 = '6';
//        String charA = "lesson1";
//
//        boolean booleanA = true;

       System.out.println(result(10,5,20,2)); // метод вычисляющий арифметическое действие

        sum2(8, 6); // метод вычислиящий сумму в диапазаоне от 10 до 20

        System.out.println(reverse1(658)); // этот метод потратил много нервов ))))))

        System.out.println(yearIsLeap(2030)); // высокостный год вычисляем
    }


    public static int result (int a, int b, int c, int d) {
        return a * (b + (c/d));
    }

    public static void sum2(int x1, int x2) {
        int s = x1 + x2;
        if (s >= 10 && s <= 20) System.out.println("true");
        else System.out.println("false");
    }

    public static boolean yearIsLeap (int year){
        if (year %4 !=0){
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0){
            return false;
        } else {
            return true;
        }
    }

        private static int reverse1 (int num){
            int c = 0;
            while (num !=0){
                c = c * 10;
                c = c + num % 10;
                num = num / 10;
            }
            return c;
        }

    }

