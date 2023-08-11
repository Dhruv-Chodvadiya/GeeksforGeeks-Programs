import java.util.Arrays;

public class Smaller_and_Larger {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int x=4;
        int[] val=prints(arr,x);
        System.out.println(Arrays.toString(val));
    }
    public static int[] prints(int[] arr, int x){
        int[] count={0,0};
        for(int i=0;i<arr.length;i++){
            if(x>=arr[i]){
                count[0]++;
            }
            if(x<=arr[i]){
                count[1]++;
            }
        }
        return count;
    }
}
