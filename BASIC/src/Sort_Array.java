import java.util.Arrays;

public class Sort_Array {
    public static void main(String[] args) {
        int[] arr={1,5,3,4,2};
        int n=arr.length;

        int[] val=sortArray(arr,n);
        System.out.println(Arrays.toString(val));
    }
    public static int[] sortArray(int[] arr,int n){
        Arrays.sort(arr);
        return arr;
    }
}
