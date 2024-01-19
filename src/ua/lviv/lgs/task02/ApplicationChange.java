package ua.lviv.lgs.task02;

import ua.lviv.lgs.task01.MyExeption;

import java.util.Arrays;
import java.util.Scanner;

public class ApplicationChange {
    public static void main(String[] args) throws MyExeption {
        Scanner sc = new Scanner(System.in);
        String str = "Задано начебто речення. А-ha-ha-ha ця абаракадабра має забагато голосних літер, а саме: а, о, у, е, и, і";
        String vavels = "AaEeIiOoUuУуЕеІіАаОоИи";
        String strNew = new String();

        System.out.println("1. Заміна у заданій фразі.");
        System.out.println(str);


        char[] chars = getChars(str, vavels);

        System.out.println(String.copyValueOf(chars));

        System.out.println("2. Заміна введеної фрази.");
        System.out.println("Введіть речення:");

        if (sc.hasNextLine()) {
            strNew = sc.nextLine();
            chars = getChars(strNew, vavels);
            System.out.println(String.copyValueOf(chars));
        }

    }

    private static char[] getChars(String str, String vavels) {
        char chars[] = str.toCharArray();
        char charsVavels[] = vavels.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vavels.length(); j++) {
                if (chars[i] == charsVavels[j]) chars[i] = '-';
            }
        }
        return chars;
    }
}
