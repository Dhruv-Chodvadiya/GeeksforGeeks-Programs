import java.util.Arrays;

public class Left_Rotation {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        int k=2;
        left(arr,n,k);
    }
    public static void left(int[] arr,int n, int k){
//        k=k%n;

        int arr1[] = new int[k];
        for(int i=0;i<k;i++)
        {
            arr1[i] = arr[i];
        }
        for(int i =0;i<n-k;i++)
        {
            arr[i]=arr[i+k];
        }
        int j=0;
        for(int i = n-k;i<n;i++)
        {
            arr[i]= arr1[j];
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
