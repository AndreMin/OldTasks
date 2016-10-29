package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Andrej Minenko on 29.10.2016.
 */
public class Pt6 {
    /**
     * Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них
     */
    void tsyfryVPorjadkeVozrost() {
        System.out.println('\n' + "6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько," +
                " найти первое из них");
        System.out.println("Введите целые числа через пробел");
        Scanner scan = new Scanner(System.in);
        String[] nums = scan.nextLine().split(" ");
        for (String num : nums) {
            byte[] a = num.getBytes();
            byte[] b = num.getBytes();
            Arrays.sort(b);
            if (Arrays.equals(a, b)) {
                System.out.println("Искомое число: " + num);
                break;
            }
        }
    }
}
