package ua.lviv.lgs.task03;

import ua.lviv.lgs.task01.MyExeption;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ApplicationCountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();

        System.out.println("Введіть речення:");
        // Дуже довге речення на 14 слів, яке має не багато і не мало слів, а якраз стільки, щоб  перевірити роботу.

        int cc = 0;
        if (sc.hasNextLine()) {
            str = sc.nextLine().trim();

            String[] sArr = str.split(" ");

            for (String s : sArr) {
                if (s.length() > 2) cc++;
            }

            System.out.println("У цьому реченні " + cc + " слів, які складаються з більше, ніж 2 літери ");

        }
    }
}
