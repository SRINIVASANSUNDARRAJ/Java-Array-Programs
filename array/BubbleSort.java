package array;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {4, 3, 7, 1, 9, 6, 8};
        sort(a);
        for (int n : a) {
            System.out.print(n+" ");
        }
    }
        public static void sort(int[] a){
            for (int i = 0; i < a.length-1; i++) {
                for (int j = 0; j < a.length-i-1; j++) {
                    if(a[j]>a[j+1]){
                        int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            }
        }
    }

