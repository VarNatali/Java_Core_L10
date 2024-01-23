package ua.lviv.lgs.task02;

import ua.lviv.lgs.task01.MyExeption;

import java.util.Arrays;
import java.util.Scanner;

public class ApplicationChange {


    public static void main(String[] args) throws MyExeption {
        Scanner sc = new Scanner(System.in);
        String str = "Задано начебто речення. А-ha-ha-ha ця абаракадабра має забагато голосних літер, а саме: а, о, у, е, и, і";

        String str2;

        System.out.println("1. Заміна фрази.");
        System.out.println(str);

        String[] words = new String[]{str.replaceAll("[A,a,E,e,I,i,o,O,u,U,У,у,Е,е,І,і,А,а,О,о,И,и]", "-")};

        System.out.println(Arrays.toString(words));

        System.out.println("2. Заміна введеної фрази.");
        System.out.println("Введіть речення:");

        if (sc.hasNextLine()) {
            str2 = sc.nextLine();
            String[] words2 = new String[]{str2.replaceAll("[A,a,E,e,I,i,o,O,u,U,У,у,Е,е,І,і,А,а,О,о,И,и]", "-")};
            System.out.println("Результат:" + Arrays.toString(words2));
        }


    }
}



