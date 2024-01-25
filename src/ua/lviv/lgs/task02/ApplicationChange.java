package ua.lviv.lgs.task02;

import ua.lviv.lgs.task01.MyExeption;

import java.util.Scanner;


public class ApplicationChange {
    public static void main(String[] args) throws MyExeption {
        Scanner sc = new Scanner(System.in);
        String str = "Задано начебто речення. А-ha-ha-ha ця абаракадабра має забагато голосних літер, а саме: а, о, у, е, и, і";
        String str2;

        System.out.println("1. Заміна фрази.");
        System.out.println(str);
        str2 = str.replaceAll("[AaEeIioOuUУуЕеІіАаОоИи]", "-");
        System.out.println(str2);

        System.out.println("2. Введіть речення:");

        if (sc.hasNextLine()) {
            str2 = sc.nextLine();

            System.out.println("Результат:" + str2.replaceAll("[AaEeIioOuUУуЕеІіАаОоИи]", "-"));
        }


    }
}



