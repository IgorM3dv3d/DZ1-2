package Ucheba.DZ_20_21;

import java.util.Arrays;

public class Method {
    public static int square;
    private static int[][] String;

    public static int square(int value) {

        return value * value;
    }

    public static void printFullName() {
        String firstName = "Ivan";
        String secondName = "Petrov";
        System.out.println(firstName + " " + secondName);
    }

    static String[] cornerValuesArray(String[] words) {
        String min = words[0];
        String max = words[0];

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < min.length()) {
                min = words[i];
            } else if (words[i].length() > max.length()) {
                max = words[i];
            }
        }
        return new String[]{min, max};
    }
}

