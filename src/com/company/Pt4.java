package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Andrej Minenko on 29.10.2016.
 */
public class Pt4 {
    /**
     * Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них
     */
    void razlichnTsyfry() {
        System.out.println('\n' + "4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько," +
                " найти первое из них");
        System.out.println("Введите целые числа через пробел");
        Scanner scan = new Scanner(System.in);
        String[] nums = scan.nextLine().split(" ");
        //задаем массив, значения которого - количество раличных цифр в числе. Обнуляем его.
        int arr1[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr1[i] = 0;
        }
        int k = 0;
        //перебираем числа в массиве nums:разбиваем их на цифры, сортируем в порядке возрастания
        for (String num : nums) {
            byte[] a = num.getBytes();
            Arrays.sort(a);
            int tmp = 1, step = 1;
            for (int i = 0; i < a.length; i += step) {
                step = 1;
                for (int j = i; j < (a.length - 1); j++) {
                    if (a[j] != a[j + 1]) {
                        tmp++;
                        break;
                    }
                    step++;
                }
            }
            //здесь заполняем массив с количеством различных чисел для каждого числа
            arr1[k++] = tmp;
        }
        //перебираем числа на количество различных цифр
        int min = 0;
        for (k = 1; k < nums.length; k++) {
            if (arr1[k] < arr1[min]) {
                min = k;
            }
        }
        System.out.println("Искомое число " + nums[min]);
    }
}
