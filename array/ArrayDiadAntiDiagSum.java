package array;

import java.util.Scanner;

public class ArrayDiadAntiDiagSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array :");
        int size = sc.nextInt();
        int[][] a = new int[size][size];
        System.out.println("Enter the array values :");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i==j || i+j==size-1){
                    sum+=a[i][j];
                }
            }
        }
        System.out.println("The sum of diagnal & Antidiagnal :"+sum);
    }
}
