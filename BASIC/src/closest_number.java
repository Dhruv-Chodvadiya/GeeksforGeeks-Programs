import java.util.Arrays;

public class closest_number {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=4;
        int n=arr.length;
        int val=closest(arr,target,n);
        System.out.println(val);

    }
    public static int closest(int[] arr,int target,int n){
        Arrays.sort(arr);
        if(target<=arr[0]){
            return arr[0];
        }
        for(int i=0;i<n;i++){
            if(arr[i]>=target){
                int z=arr[i]-target;
                int z1=target-arr[i-1];
                if(z1<z){
                    return arr[i-1];
                }
                else{
                    return arr[i];
                }
            }
        }
        return arr[n-1];
    }
}
