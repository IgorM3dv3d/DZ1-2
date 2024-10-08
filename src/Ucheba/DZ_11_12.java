package Ucheba;

import java.util.Scanner;

public class DZ_11_12 {
    public static void main(String[] args) {
//        part1();
//        part2();
//        part3();
    }

    static void part1() {
        Scanner scanner = new Scanner(System.in);
        int age1 = 2;
        if (2 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + ",");
            System.out.println("то ему в детский сад");
        }

        int age2 = 7;
        if (7 <= 18) {
            System.out.println("Если возраст человека равен " + age2 + ",");
            System.out.println("то ему в школу");
        }

        int age3 = 19;
        if (18 < 19) {
            System.out.println("Если возраст человека равен " + age3 + ",");
            System.out.println("то ему в университет");
        }

        int age4 = 25;
        if (24 < 25) {
            System.out.println("Если возраст человека равен " + age4 + ",");
            System.out.println("то ему на работу");
        }
    }

        static void part2() {
        Scanner scanner = new Scanner(System.in);
        int Diana = 66660;
        int Andrey = 77770;
        int Marya = 88880;
        int valueDiana =(Diana*15)/100;
        int valueAndrey =(Andrey*15)/100;
        int valueMarya =(Marya*15)/100;
        Math.abs(Diana+valueDiana);
        Math.abs(Andrey+valueAndrey);
        Math.abs(Marya+valueMarya);
        System.out.println("Диана теперь получает " + (Math.abs(Diana+valueDiana)) + " рублей." + " Годовой доход вырос на " + valueDiana + " рублей.");
        System.out.println("Андрей теперь получает " + (Math.abs(Andrey+valueAndrey)) + " рублей." + " Годовой доход вырос на " + valueAndrey + " рублей.");
        System.out.println("Мария теперь получает " + (Math.abs(Marya+valueMarya)) + " рублей." + " Годовой доход вырос на " + valueMarya + " рублей.");
            }




        static void part3() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Месяц: ");
            int monthNumber = sc.nextInt();
            String message;

            switch (monthNumber) {
                case 1:
                    message = "Январь";
                    break;
                case 2:
                    message = "Февраль";
                    break;
                case 3:
                    message = "Март";
                    break;
                case 4:
                    message = "Апрель";
                    break;
                case 5:
                    message = "Май";
                    break;
                case 6:
                    message = "Июнь";
                    break;
                case 7:
                    message = "Июль";
                    break;
                case 8:
                    message = "Август";
                    break;
                case 9:
                    message = "Сентябрь";
                    break;
                case 10:
                    message = "Октябрь";
                    break;
                case 11:
                    message = "Ноябрь";
                    break;
                case 12:
                    message = "Декабрь";
                    break;
                default:
                    message = "Неверный номер месяца";
            }

            System.out.println(message);

            switch (monthNumber) {
                case 1, 2, 12:
                    System.out.println("Зима");
                    break;
                case 3, 4, 5:
                    System.out.println("Весна");
                    break;
                case 6, 7, 8:
                    System.out.println("Лето");
                    break;
                case 9, 10, 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Неверный номер сезона");
            }
        }

}





