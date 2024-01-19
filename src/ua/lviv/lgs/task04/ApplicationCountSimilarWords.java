package ua.lviv.lgs.task04;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ApplicationCountSimilarWords {
    public static void main(String[] args) {


        String str = "This is a long sentence to checking which word is used most often in the sentence. Checking an English word is much easier than checking a Ukrainian word. Checking this.";

        int count = 1;
        int bigCount = 1;


        str.replace(".", " ");

        str.replace(",", " ");
        String strings[] = str.toLowerCase().replace(".", " ").replace(",", " ").split(" ");
        System.out.println(Arrays.toString(strings));
        int num = (int) Arrays.stream(strings).count();

        for (int i = 0; i < num; i++) {
            if (!strings[i].equals("=")) {

                for (int j = i + 1; j < num; j++) {
                    if (strings[i].equals(strings[j])) {
                        strings[j] = "=";
                        count++;
                    }


                }

                if (count > 1 && count >= bigCount) {
                    bigCount = count;
                    System.out.println("Слово   " + strings[i] + "   =  " + bigCount+ "  разів");
                }
                count = 1;

            }

        }
    }
}
