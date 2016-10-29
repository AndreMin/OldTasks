package com.company;

import java.util.Scanner;

/**
 * Created by Andrej Minenko on 29.10.2016.
 */
public class Pt16 {
    void matrixSendZeroTEnd() {
        int n;
        System.out.println('\n'+"16. Преобразовать строки матрицы таким образом, чтобы элементы, равные нулю, " +
                "располагались после всех остальных");
        System.out.println("Введите количество строк и столбцов в матрице N*N: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int twoDim[][] = new int[n][n];
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
        System.out.println("Преобразованная матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (twoDim[i][j] == 0) {
                        int tmp = twoDim[i][j];
                        twoDim[i][j] = twoDim[i][k];
                        twoDim[i][k] = tmp;
                    }
                }

                System.out.print(twoDim[i][j] + " ");
            }
            System.out.println();
        }
    }
}
