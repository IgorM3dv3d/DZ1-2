package Ucheba.DZ_43_44;

import java.util.ArrayList;
import java.util.LinkedList;

public class Comparison {

    public static void main(String[] args) {

        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();

        final int N = 1_000_000;
        final int M = 100_000;

        for (int i = 0; i < N; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            arrayList.get((int) (Math.random() * (N - 1)));
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            linkedList.get((int) (Math.random() * (N - 1)));
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - startTime));
    }
}
