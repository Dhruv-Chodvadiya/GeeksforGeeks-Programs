import java.util.ArrayList;
import java.util.Arrays;

public class Sort_array {
    public static void main(String[] args) {
        int[] arr={1,0,3,2};
        int n=arr.length;
        sort(arr,n);
    }
    public static void sort(int[] a,int n){
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
