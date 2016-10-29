package com.company;

import java.util.Scanner;

/**
 * Created by Andrej Minenko on 29.10.2016.
 */
public class Pt5 {
    /**
     * Найти количество чисел, содержащих только четные цифры, а среди них количество чисел с равным числом четных и
     * нечетных цифр.
     */
    void chetnTsyfry() {
        int odd, even, n = 0, k = 0;
        System.out.println('\n' + "5. Найти количество чисел, содержащих только четные цифры, а среди них количество " +
                "чисел с равным числом четных и нечетных цифр");
        System.out.println("Введите целые числа через пробел");
        Scanner scan = new Scanner(System.in);
        String[] nums = scan.nextLine().split(" ");
        for (String num : nums) {
            byte[] a = num.getBytes();
            odd = 0;
            even = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 == 0)
                    even = even + 1;
                else odd = odd + 1;
            }
            if (even > 0)
                k = k + 1;
            if (even == odd)
                n = n + 1;
        }
        System.out.println("Количество чисел, содержащих четные  цифры: " + k);
        System.out.print("Количество чисел, содержащих равное количество четных и нечетных чисел: " + n + '\n');
    }
}
