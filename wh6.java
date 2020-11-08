package lesson6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class wh6 {


    public static void main(String[] args) {

        String part1 = " Glory Glory ";

        String part2 = " Manchester Unaited ";

        try {
            FileOutputStream fos = new FileOutputStream("MU.txt");
            byte[] buffer = part1.getBytes();  // переводим в байты
            fos.write(buffer, 0, buffer.length);
            fos.write(part2.getBytes());       // переводим в байты вторую строку
        } catch (IOException e) {
            System.out.println("Writing failed!");
        }
        Search("MU.txt", "Manchester");
    }

    private static void Search(String filename, String word) {  // метод для поиска слова

        try {
            FileInputStream A = new FileInputStream(filename);
            int symbol = 0;
            int index = 0;
            byte[] wordbuffer = word.getBytes();
            do {
                symbol = A.read();
                if (wordbuffer[index] == symbol) {
                    index++;
                    if (index == wordbuffer.length) {
                        System.out.println("Ваша команда - " + word);
                        break;
                    }
                } else {
                    index = 0;
                }
            } while (symbol != -1);
        } catch (FileNotFoundException e) {
            System.out.println("A file is not found!");
        } catch (IOException e) {
            System.out.println("Writing failed!");
        }
    }
}



