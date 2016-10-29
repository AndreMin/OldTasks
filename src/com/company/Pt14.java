package com.company;

import java.util.Scanner;

/**
 * Created by Andrej Minenko on 29.10.2016.
 */
public class Pt14 {
    void matrixBezAvgStroki() {
        int n;
        double sum1;
        System.out.println('\n'+"14.Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое");
        System.out.println("Введите количество строк и столбцов в матрице ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int twoDim[][] = new int[n][n];
        double sum2[] = new double[n];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                twoDim[i][j] = (int) (Math.random() * 2 * (n + 1));
            }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(twoDim[i][j] + " ");
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            sum1 = 0;
            for (int j = 0; j < n; j++) {
                sum1 = sum1 + twoDim[i][j];
            }
            System.out.println();
            System.out.println("Среднее арифметическое " + (i + 1) + "-ой строки: " + sum1 / n);
            sum2[i] = sum1;
        }
        System.out.println();

        System.out.println("Новая матрица с вычетом среднего арифметического строки матрицы: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print((twoDim[i][j] - sum2[i] / n) + " ");
            System.out.println();
        }
    }
}
