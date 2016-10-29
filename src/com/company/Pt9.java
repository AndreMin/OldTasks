package com.company;

import java.util.Scanner;

/**
 * Created by Andrej Minenko on 29.10.2016.
 */
public class Pt9 {
    /**
     * Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения элемен-
     * тов матрицы в интервале значений от -n до n с помощью датчика случайных чи-
     * сел.
     */
    void matrixNN() {
        int n;
        System.out.println('\n'+"9. Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения элемен-\n" +
                "тов матрицы в интервале значений от -n до n с помощью датчика случайных чи-\n" +
                "сел.");
        System.out.println("Введите количество строк и столбцов в матрице ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int twoDim[][] = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                twoDim[i][j] = (int) (Math.random() * 2 * (n + 1) - (n + 1));
            }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(twoDim[i][j] + " ");
            System.out.println();
        }
    }
}
