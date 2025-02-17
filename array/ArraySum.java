package array;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size :");
        int size=sc.nextInt();
        int[] a= new int[size];
        for(int i=0;i<size;i++){
            System.out.print("enter value "+(i+1)+" :");
            a[i]=sc.nextInt();
        }
        System.out.println("The sum of an array");
        int sum=0;
        for(int n: a){
            sum+=n;
        }
        System.out.println(sum);
    }
}

