import java.util.Arrays;

public class minimum_and_maximum {
    public static void main(String[] args) {
        long[] arr={1,2,3,4,5};
        long n=arr.length;
        long[] pair=MinMax(arr,n);
        System.out.println(Arrays.toString(pair));
    }
    public static long[] MinMax(long[] a,long n){
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,a[i]);
            min=Math.min(min,a[i]);
        }
        long[] pair=new long[2];
        pair[0]=min;
        pair[1]=max;
        return pair;
    }
}
