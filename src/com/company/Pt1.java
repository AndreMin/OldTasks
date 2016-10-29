package com.company;

import java.util.Scanner;

/**
 * Created by Andrej Minenko on 29.10.2016.
 */
public class Pt1 {
    /**
     * Ввести n чисел с консоли.
     * Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
     */
    void korotkIDlinnoe() {
        String max = null, min = null;
        int maxl = 0, minl = 10, n;
        System.out.println("1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину");
        System.out.println("Введите размер массива:");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int[] nums = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < nums.length; i++) {
            String num = scan.next();

            if (minl > num.length()) {
                minl = num.length();
                min = num;
            }
            if (maxl < num.length()) {
                maxl = num.length();
                max = num;
            }

        }
        System.out.println("Минимальное число " + min + " состоит из " + minl + " цифр." +
                '\n' + "Максимальное число " + max + " состоит из " + maxl + " цифр." + '\n');
    }
}
