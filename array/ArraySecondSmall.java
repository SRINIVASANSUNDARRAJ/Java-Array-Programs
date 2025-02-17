package array;

import java.util.Scanner;

public class ArraySecondSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int size=sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the array values ");
        for (int i = 0; i < size; i++) {
            a[i]=sc.nextInt();
        }
        int s1=a[0];
        int s2=a[0];
        for (int i = 0; i < size; i++) {
            if(a[i]<s1){
                s2=s1;
                s1=a[i];
            }
            else if(a[i]<s2 && a[i]!=s1){
                s2=a[i];
            }
        }
        System.out.println(s2);
    }
}
