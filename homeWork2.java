package lesson21;

import java.util.Arrays;

public class homeWork2 {
    public static void main(String[] args) {

            System.out.println(Arrays.toString(array1()));
            System.out.println(Arrays.toString(array2()));
            System.out.println(Arrays.toString(array3()));
            System.out.println(Arrays.toString(arrayMinAndMax()));
            matrix1And0();
    }
    //задание номер 1
    public static int[] array1(){
        System.out.println("задание № 1");
        int[] mas = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int a = 0;
        int b = 1;
        for (int i = 0; i < mas.length; i++){
            //        mas[i] = mas[i] == 1 ? 0 : 1; //тернарная запись.
            //        System.out.println(mas[i]);
            if (mas[i] == 1){
                mas[i] = a;
            }else {mas[i] = b; }
        }
        return mas;
    }

    //задание номер 2
    public static int[] array2(){
        System.out.println("задание № 2");
        int[] mas2 = new int[8];
        for (int i = 1, y = 0; y < mas2.length; i+=3, y++) {
            mas2[y] = i;
        }
        return mas2;
    }

    //задание номер 3
    public static int[] array3(){

        System.out.println("задание № 3");

        int [] mas3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(" Массив до преобразования ");
        for ( int i : mas3){
            System.out.print( i + " " );
        }

        System.out.println("\n Массив после преобразования ");
        for (int i = 0; i < mas3.length; i++) {
            if (mas3[i] < 6) mas3[i] *=2;
        }
        return mas3;
    }

    // задание номер 4

    public static int[] arrayMinAndMax(){
        System.out.println("задание № 4");
        int [] mas4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = mas4[0], max = mas4[0];

        for (int i = 0; i < mas4.length; i++) {
            min = (min < mas4[i]) ? min : mas4[i];
            max = (max > mas4[i]) ? max : mas4[i];
        }
        System.out.println("\n минимальный элемент равен: " + min + "\n минимальный элемент равен: " + max);

        return mas4;
    }

    // задание номер 5

    public static void matrix1And0(){
        System.out.println("задание № 5");
        int[][] mas5 = new int[8][8];
        for (int i = 0; i < mas5.length; i++) {
            for (int j = 0, j2 = mas5[i].length; j < mas5[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) mas5[i][j] = 1;
                System.out.print(mas5[i][j] + " ");
            }
            System.out.print("\r\n");
        }

    }




}

