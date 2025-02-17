package array;

import java.util.Scanner;

public class ArrayProd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size :");
        int size=s.nextInt();
        int[] a=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the value "+(i+1)+" :");
            a[i]=s.nextInt();
        }
        System.out.println();
        for(int n: a){
            System.out.print(n+" ");
        }
        int prod=1;
        for(int n: a){
            prod*=n;
        }
        System.out.println("prod of an array = " + prod);
    }
}
