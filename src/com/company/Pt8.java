package com.company;

import java.util.Scanner;

/**
 * Created by Andrej Minenko on 29.10.2016.
 */
public class Pt8 {
    /**
     * Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз
     */
    void matrix() {
        int n, k = 1;
        System.out.println('\n' + "8. Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз");
        System.out.println("Введите количество строк и столбцов в матрице");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int twoDim[][] = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                twoDim[i][j] = k;
                k++;
            }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(twoDim[i][j] + " ");
            System.out.println();
        }
    }
}
