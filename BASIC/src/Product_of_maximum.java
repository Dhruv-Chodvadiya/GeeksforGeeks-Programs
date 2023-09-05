import java.util.Arrays;

public class Product_of_maximum {
    public static void main(String[] args) {
        int[] arr={5, 7, 9, 3, 6, 2};
        int[] brr= {1, 2, 6, -1, 0, 9};
        int n=arr.length;
        int m=brr.length;
        long val=find(arr,brr,n,m);
        System.out.println(val);
    }
    public static long find(int[] arr,int[] brr,int n,int b){
        Arrays.sort(arr);
        Arrays.sort(brr);

        long ans=arr[n-1]*brr[0];
        return ans;

    }
}
