package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Andrej Minenko on 29.10.2016.
 */
public class Pt7 {
    /**
     * Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них
     */
    void tolkoRaznTsyfry() {
        System.out.println('\n' + "7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти" +
                " первое из них");
        System.out.println("Введите целые числа через пробел");
        Scanner scan = new Scanner(System.in);
        String[] nums = scan.nextLine().split(" ");
        int arr1[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr1[i] = 0;
        }
        int k = 0;
        for (String num : nums) {
            byte[] a = num.getBytes();
            Arrays.sort(a);
            int tmp = 1, step = 1;
            for (int i = 0; i < a.length; i += step) {
                step = 1;
                for (int j = i; j < (a.length - 1); j++) {
                    if (a[j] == a[j + 1]) {
                        tmp++;
                        break;
                    }
                    step++;
                }
            }
            arr1[k++] = tmp;
        }
        int min = 0;
        for (k = 1; k < nums.length; k++) {
            if (arr1[k] < arr1[min]) {
                min = k;
            }
        }
        System.out.println("Искомое число " + nums[min]);
    }
}
