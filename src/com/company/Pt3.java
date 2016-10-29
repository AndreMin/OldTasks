package com.company;

import java.util.Scanner;

/**
 * Created by Andrej Minenko on 29.10.2016.
 */
public class Pt3 {
    /**
     * Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину
     */
    void dlinaChisel() {
        int n;
        System.out.println('\n' + "3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину");
        System.out.println("Введите размер массива:");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        //создание массива чисел(строк)
        String[] nums = new String[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            nums[i] = scan.next();
        }
        //сортировка по возрастанию длины чисел
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i].length() > nums[j].length()) {
                    String tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        //сортировка по возрастанию
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i].length() > nums[j].length()) {
                    String tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        //вывод чисел с длинной меньше среднего
        double maxlength = nums[n - 1].length(), minlength = nums[0].length();
        double avlength = (maxlength + minlength) / 2;
        System.out.println("Числа, длина которых меньше средней:");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i].length() < avlength) {
                System.out.print(nums[i] + " ");
                System.out.print(" ");
                System.out.println("его длина равна " + nums[i].length());
            }
        }
        //вывод чисел с длинной больше средней
        System.out.println("Числа, длина которых больше средней:");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i].length() > avlength) {
                System.out.print(nums[i] + " ");
                System.out.print(" ");
                System.out.println("его длина равна " + nums[i].length());
            }
        }

    }
}
