package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMatrixMux {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row range :");
        int row = sc.nextInt();
        System.out.println("Enter the Col range :");
        int col = sc.nextInt();
        int[][] a = new int[row][col];
        int[][] b = new int[row][col];
        int[][] result = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        System.out.println("Enter matrix a values :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter matrix b values");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
