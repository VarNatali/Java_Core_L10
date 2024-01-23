package ua.lviv.lgs.task04;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;

public class ApplicationCountSimilarWords {
    public static void main(String[] args) {


                String sentence = "This is a long sentence to checking which word is used most often in the sentence. Checking an English word is much easier than checking a Ukrainian word. Checking this.";

                String[] words = sentence.replaceAll("[,.]", " ").split("\\s+");

                Map<String, Integer> wordCount = new HashMap<>();

                for (String word : words) {
                    word = word.toLowerCase();
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }

                String mostFrequentWord = "";
                int maxCount = 0;

                for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                    if (entry.getValue() > maxCount) {
                        maxCount = entry.getValue();
                        mostFrequentWord = entry.getKey();
                    }
                }

                System.out.println("Слово, яке найчастіше зустрічається: " + mostFrequentWord);



/*
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

        }*/
    }
}
