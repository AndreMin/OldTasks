package com.company;

import java.util.Scanner;

/**
 * Created by Andrej Minenko on 29.10.2016.
 */
public class Pt2 {
    /**
     * Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины
     */
    void uporjadChisla() {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины");
        System.out.println("Введите размер массива:");
        n = scan.nextInt();

        int[] nums = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        //сортировка по убыванию
        System.out.print("Массив по убыванию:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] < nums[j]) {
                    int tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                }
            }
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        //сортировка по возрастанию
        System.out.print("Массив по возрастанию:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j]) {
                    int tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                }

            }
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
