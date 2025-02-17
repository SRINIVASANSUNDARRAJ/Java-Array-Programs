package array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a={5,7,9,3,5,6,5};
        System.out.println(search(a,5));
    }
    public static int search(int[] a,int ele){
        for (int i = 0; i < a.length; i++) {
            if(a[i]==ele)
                return i;
        }
        return -1;
    }
}
