import java.lang.reflect.Array;
import java.util.Arrays;

public class Find_the_smallest {
    public static void main(String[] args) {
        long[] arr={1,2,3,4,5};
        long n = arr.length;
        long nn[]=sort(arr,n);
        System.out.println(Arrays.toString(nn));
    }
    public static long[] sort(long[] a,long n){
        long min = Long.MAX_VALUE;
        long min2 = Long.MAX_VALUE;

        for(int i=0; i<n; i++){
            min = Math.min(min,a[i]);
        }

        for(int i=0; i<n; i++){
            if(a[i] != min){
                min2 = Math.min(min2,a[i]);
            }
        }

        if(min2 == Long.MAX_VALUE){
            return new long[] {-1,-1};
        }

        return new long[] {min,min2};
    }
}
