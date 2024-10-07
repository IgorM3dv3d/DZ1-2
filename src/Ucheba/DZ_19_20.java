package Ucheba;

import java.util.Arrays;

public class DZ_19_20 {
    public static void main(String[] args) {
        zadanye1();
        zadanye2();
        zadanye3();
        zadanye4();
        zadanye5();
    }


    static void zadanye1() {
        int[] array = new int[6];
        array[0] = 4;
        array[1] = 8;
        array[2] = 12;
        array[3] = 16;
        array[4] = 20;
        array[5] = 24;

        int result = 0;
        for (int digit : array) {
            result += digit;
        }
        System.out.println("Среднее значение массива равно: " + result / array.length);
    }

    static void zadanye2() {
        double[] massive = {3.5, 2.1, -4.8, 7.4, -1.6, 8.9};
        double min = massive[0];
        double max = massive[1];
        for (int i = 0; i < massive.length; i++) {
            if (min > massive[i]) {
                min = massive[i];
            }
        }
        for (int i = 0; i < massive.length; i++) {
            if (max < massive[i]) {
                max = massive[i];
            }
        }
        System.out.println("Максимальное значение массива равно: " + max);
        System.out.println("Минимальное значение массива равно: " + min);
    }

    static void zadanye3() {
        char[] glasnye = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
        char[] chars = {'J', 'o', 'k', 'E', 'R', 'a'};

        int counter = 0;

        for (char ch : chars) {
            for (char ch2 : glasnye) {
                if (ch == ch2) {
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }


    static void zadanye4() {
        String str = "Сегодня погода будет солнечной";
        char[] chArray = str.toCharArray();
        String str1 = str.replace(' ', '_');

        System.out.println(Arrays.toString(chArray));
        System.out.println(str1);
    }

    static void zadanye5() {
        String str = "I love Java ";
        String[] words = str.split(" ");
        System.out.print(Arrays.toString(words));
    }
}









