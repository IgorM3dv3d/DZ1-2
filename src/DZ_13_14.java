public class DZ_13_14 {
    public static void main(String[] args) {
     //   DZ1();
        DZ2();
    }

    static void DZ1() {
//      Задача 1. Вывод чётных чисел от 1 до n
//      Условие: Напишите программу, которая выводит все НЕчётные числа от 1 до заданного числа n.
//      Пример: Для n = 10 программа должна вывести: 1 3 5 7 9
        int n = 10;
        for (int i = 0; i < n; i++) {
            if(i == 0); {
            }
            if (i % 2 != 0) {
                System.out.print(" " + i);
            }
        }
    }

    static void DZ2() {
//      Задача 2. Произведение чисел от 1 до n
//      Условие: Напишите программу, которая вычисляет произведение всех чисел от 1 до заданного числа n
//      Пример: Для n = 4, результат будет 1 * 2 * 3 * 4 = 24.
        int number = 24;
        System.out.println(number);
        int sum = 0;

        while (sum > number) {
            int digit = number % 10;
            System.out.print(digit);
            sum += 10;

            number /= 10;
            System.out.println(sum);
        }
        System.out.println(sum);

    }



}


