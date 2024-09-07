import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        byte myByte = 97;
        short myShort = 250;

        int myInt = 1_500_000_000;
        long myLong = 2_540_020_100_000L;

        float myFloat = 3.14f;
        double myDouble = 3.14;

        char myChar = 'B';
        boolean myBoolean = true;



        int a = 12;
        int b = 8;

        int sum = a+b;
        int diff = a-b;
        int product = a*b;
        int quotient = a/b;
        int remainder = a%b;

        System.out.println("Сложение: " + sum);
        System.out.println("Отрицание: " + diff);
        System.out.println("Умножение: " + product);
        System.out.println("Деление: " + quotient);
        System.out.println("Отстаток от деления: " + remainder);

    }
}