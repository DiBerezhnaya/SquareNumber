package ru.netology.sqr;

public class SQRService {

    public static int calculateSqrtCeil(int min, int max) {
        int j = 0;
        for (int i = 10; i <= 99; i++) {
                int mult = i * i;
                if (mult >= min && mult <= max) {
                    System.out.println(j++);
                }
            }
        System.out.println("Total " + j);
        return j;
    }
}