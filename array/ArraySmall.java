package array;

import java.util.Scanner;

public class ArraySmall {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array :");
        int size=s.nextInt();
        int[] a=new int[size];
        System.out.println();
        System.out.println("Enter "+size+" values");
        for(int i=0;i<size;i++){
            a[i]=s.nextInt();
        }
        int small=a[0];
        for(int j=1;j<size;j++){
            if(a[j]<small){
                small=a[j];
            }
        }
        System.out.println(small);
    }
}
