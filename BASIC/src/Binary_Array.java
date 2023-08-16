import java.util.Arrays;

public class Binary_Array {
    public static void main(String[] args) {
        int[] arr={0,1,1,0,1};
        int n= arr.length;
        int[] val=binary(arr,n);
        System.out.println(Arrays.toString(val));
    }
    public static int[] binary(int[] arr,int N){
        int count=0;
        for(int i=0;i<N;i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0;i<N;i++){
            if(i<count){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
        return arr;
    }
}
