import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите общее число отзывов: ");
        int allFeedbackCount = sc.nextInt();
        System.out.print("Введите число хороших отзывов: ");
        int goodFeedbackCount = sc.nextInt();
        System.out.print("Введите число плохих отзывов: ");
        int badFeedbackCount = sc.nextInt();


        //    Random random = new Random();
        //    int allFeedbackCount = random.nextInt(100, 150);
        //    int goodFeedbackCount = random.nextInt(50,  allFeedbackCount);
        //    int badFeedbackCount = allFeedbackCount - goodFeedbackCount;

        double goodFeedbackPercent = goodFeedbackCount * 100.0 / allFeedbackCount;
        double badFeedbackPercent = badFeedbackCount * 100.0 / allFeedbackCount;
        int goodFeedbackPercentInt = (int) Math.round(goodFeedbackPercent);
        int badFeedbackPercentInt = (int) Math.round(badFeedbackPercent);
        System.out.println("Отзывов - " + allFeedbackCount + "-" + goodFeedbackCount + "-" + badFeedbackCount +
                "\nХороших отзывов (double) - " + goodFeedbackPercent + "%" +
                "\nПлохих отзывов (double) - " + badFeedbackCount + "%" +
                "\nХороших отзывов (int) - " + goodFeedbackPercentInt + "%" +
                "\nПлохих отзывов (int) - " + badFeedbackPercentInt + "%");


        Random random = new Random();
        long long1 = random.nextLong(4298);
        long long2 = random.nextLong(4298);
        long long3 = random.nextLong(4298);
        long long4 = random.nextLong(4298);

        char char1 = (char) long1;
        char char2 = (char) long2;
        char char3 = (char) long3;
        char char4 = (char) long4;

        System.out.println("код доступа" + char1 + char2 + char3 + char4);


        //long myLong = 9_230_458_075L;
        int myInt= 2^29;
        myInt += 2^31 - 1;
        System.out.println("myInt - " + myInt);
    }
    }