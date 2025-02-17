package array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a={15,17,19,21,23,25};
        System.out.println(search(a,21));
    }
    public static int search(int[] a,int ele){
        int start=0,end=a.length-1,mid;
        while (start <= end) {
            mid=(start+end)/2;
            if(ele==a[mid])
                return mid;
            else if(ele<=a[mid])
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
}
