package array;

import java.util.Scanner;

public class ArraySecondBig {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of an array :");
            int size = sc.nextInt();
            int[] a = new int[size];
            System.out.println("Enter the array values ");
            for (int i = 0; i < size; i++) {
                a[i] = sc.nextInt();
            }
            for(int n : a){
                System.out.print(n+" ");
            }
            int b1 = a[0];
            int b2 = a[0];
            for (int i = 0; i < size; i++) {
                if (a[i] > b1) {
                    b2=b1;
                    b1 = a[i];
                } else if (a[i] > b2 && a[i] != b1) {
                    b2 = a[i];
                }
            }
            System.out.println("The second big :"+b2);
        }
    }

