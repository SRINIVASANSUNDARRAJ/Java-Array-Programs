package array;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a={7,4,8,3,6,9,5,2};
        sort(a);
        for(int n:a)
            System.out.println(n+" ");
    }
    public static void sort(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            int index=i;
            for (int j = i+1; j < a.length; j++) {
                if (a[index] > a[j])
                    index = j;
            }
                if(i!=index){
                    int temp=a[i];
                    a[i]=a[index];
                    a[index]=temp;
                }
        }
    }
}
