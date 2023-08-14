import java.lang.reflect.Array;
import java.util.Arrays;

public class Fibonacci_Numbers {
    public static void main(String[] args) {
        int n=5;
        long[] arr=printt(n);
        System.out.println(Arrays.toString(arr));
    }
    public static long[] printt(int n){
        long a=0,b=1,c=0;

        long arr[]=new long[n];
        arr[0]=1;
        int i=1;
        while(i<n){
            c=a+b;
            arr[i]=c;
            a=b;
            b=c;
            i++;
        }
        return arr;
    }
}
