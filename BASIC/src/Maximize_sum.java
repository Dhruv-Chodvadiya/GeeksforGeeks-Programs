import java.util.Arrays;

public class Maximize_sum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int val=max(arr,n);
        System.out.println(val);
    }
    public static int max(int[] arr, int n){
        long prod=0;
        long mod=1000000007;
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            prod+=(i*(long)arr[i])%mod;
            prod%=mod;
        }
        return (int)prod;
    }
}
