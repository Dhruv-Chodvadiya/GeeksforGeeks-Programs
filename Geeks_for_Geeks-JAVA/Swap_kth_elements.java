import java.util.Arrays;

public class Swap_kth_elements {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=2;
        swap(arr,k);
    }
    public static void swap(int[] arr,int k){
        int temp=arr[k-1];
        arr[k-1]=arr[arr.length-k];
        arr[arr.length-k]=temp;

        System.out.println(Arrays.toString(arr));
    }
}
