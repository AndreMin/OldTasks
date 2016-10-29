package com.company;

import java.util.Scanner;

/**
 * Created by Andrej Minenko on 29.10.2016.
 */
public class Pt11 {
    void matrixSdvig(){
        int n, k;
        System.out.println('\n'+"11. Выполнить циклический сдвиг заданной матрицы на k позиций вправо\n" +
                "(влево, вверх, вниз)");
        System.out.println("Введите количество строк и столбцов в матрице ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int twoDim[][] = new int[n][n];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                twoDim[i][j] = (int) (Math.random() * 2 * (n + 1) - (n + 1));
            }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(twoDim[i][j] + " ");
            System.out.println();
        }
        //сдвиг на к вниз
        System.out.println("Введите величину сдвига вниз:");
        k = scan.nextInt();
        System.out.println("Матрица сo сдвигом вниз на: " + k + '\n');
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(twoDim[n - k + i][j] + " ");
            System.out.println();
        }
        for (int i = k; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(twoDim[i - k][j] + " ");
            System.out.println();
        }
        //матрица со сдвигом вверх
        System.out.println("Введите величину сдвига вверх: ");
        k = scan.nextInt();
        System.out.println("Матрица сo сдвигом вверх на: " + k + '\n');

        for (int i = 0; i < n - k; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(twoDim[i + k][j] + " ");
            System.out.println();
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(twoDim[i][j] + " ");
            System.out.println();
        }
        //матрица со сдвигом влево
        System.out.println("Введите величину сдвига влево: ");
        k = scan.nextInt();
        System.out.println("Матрица сo сдвигом влево на: " + k + '\n');

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - k; j++)
                System.out.print(twoDim[i][j + k] + " ");
            for (int r = 0; r < k; r++)
                System.out.print(twoDim[i][r] + " ");
            System.out.println();
        }
        //матрица со сдвигом вправо
        System.out.println("Введите величину сдвига вправо: ");
        k = scan.nextInt();
        System.out.println("Матрица сo сдвигом вправо на: " + k);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++)
                System.out.print(twoDim[i][n - k + j] + " ");
            for (int j = k; j < n; j++)
                System.out.print(twoDim[i][j - k] + " ");
            System.out.println();
        }
    }
}
