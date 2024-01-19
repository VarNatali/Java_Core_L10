package ua.lviv.lgs.task01;

import java.util.Scanner;

public class Polindrom {
    public static void main(String[] args) throws MyExeption {
        Scanner sc = new Scanner(System.in);

        String str = new String();

        System.out.println("Введіть слово:");


            str = sc.next();

            StringBuffer sb = new StringBuffer(str);

            if (sb.length() == 5) {
                if (str.equalsIgnoreCase(sb.reverse().toString())) {
                    System.out.println("Слово є поліндромом");
                } else {
                    throw new MyExeption("Слово не є поліндромом.");
                }

            } else {
                throw new MyExeption("Слово має складатися з 5 літер.");
            }


    }
}
