import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int[] val=rotate(arr,n);
        System.out.println(Arrays.toString(val));
    }
    public static int[] rotate(int arr[],int n){
        int temp=arr[n-1];
        for(int i=0;i<n;i++)
        {
            if(i!=n-1)
                arr[n-i-1]=arr[n-i-2];
            else
                arr[0]=temp;
        }
        return arr;
    }
}
