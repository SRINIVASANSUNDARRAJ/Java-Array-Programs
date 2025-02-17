package array;

import java.util.Scanner;

public class ArrayDiagnalAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int size=sc.nextInt();
        int[][] a= new int[size][size];
        System.out.println("Enter the values of an array :");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <size; j++) {
                System.out.print(a[i][j]+" ");
                }
            System.out.println();
            }
        int sum=0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <size; j++) {
                if(i==j){
                    sum+=a[i][j];
                }
            }
        }
        System.out.println("the sum of diagnal "+sum);
    }
}
