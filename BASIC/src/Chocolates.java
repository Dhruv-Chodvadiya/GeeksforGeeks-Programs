import java.util.Arrays;

public class Chocolates {
    public static void main(String[] args) {
        int[] arr={5,3,2,4,1};
        int n=arr.length;
        int val=chocolate(arr,n);
        System.out.println(val);
    }
    public static int chocolate(int[] arr,int n){
        Arrays.sort(arr);
        return arr[0];
    }
}
