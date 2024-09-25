package D_Z;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DZ_15_16 {
    public static void main(String[] args) {
        part1();
        part2();
        part3();
    }

    static void part1() {
        String text = "23SepTeMbeR2024";
        int countLetter = 0;
        int countDigit = 0;
        int upperCase = 0;
        int lowerCase = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                ++countLetter;
            } else if (Character.isDigit(text.charAt(i))) {
                ++countDigit;
            }
        }
        System.out.println("Количество букв: " + countLetter);
        System.out.println("Количество цифр: " + countDigit);

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                ++upperCase;
            } else if (Character.isLowerCase(text.charAt(i))) {
                ++lowerCase;
            }
        }
        System.out.println("Количество заглавных букв: " + upperCase);
        System.out.println("Количество строчных букв: " + lowerCase);
    }


        static void part2 () {
            String name = "I like Java!!!";
            if (name.startsWith("I")) {
                System.out.println("Строка начинается с 'I'");
            } else {
                System.out.println("Строка не начинается с 'I'");
            }
            if (name.endsWith("!!!")) {
                System.out.println("Строка заканчивается на '!!!'");
            } else {
                System.out.println("Строка заканчивается на '!!!'");
            }
            if (name.contains("Java")) {
                System.out.println("Строка содержит 'Java'");
            } else {
                System.out.println("Строка содержит 'Java'");
            }
            int index = name.indexOf("Java");
            System.out.println(index);

            String newname = name.replace("a", "o");
            System.out.println(newname);

            String nameLowerCase = newname.toLowerCase();
            System.out.println(nameLowerCase);

            String nameUpperCase = newname.toUpperCase();
            System.out.println(nameUpperCase);
        }

        static void part3 () {
            String name1 = "Java";
            String subName1 = name1.substring(1, 3);
            System.out.println(subName1);

            String name2 = "Function";
            String subName2 = name2.substring(3, 5);
            System.out.println(subName2);

            String name3 = "Motivation";
            String subName3 = name3.substring(4, 6);
            System.out.println(subName3);
        }
    }



