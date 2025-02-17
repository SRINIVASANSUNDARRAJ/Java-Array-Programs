package array;

import java.util.Scanner;

public class ArrayBig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int size=sc.nextInt();
        int[] a= new int[size];
        System.out.println("enter the array values :");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int big=a[0];
        for(int j=1;j<size;j++){
            if(a[j]>big){
                big=a[j];
            }
        }
        System.out.println(big);
    }
}
