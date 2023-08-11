import java.util.Arrays;

public class Find_Index {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int key=5;
        int[] arr1=find(arr,key);
        System.out.println(Arrays.toString(arr1));
    }
    public static int[] find(int[] arr,int key){
        int[] b={-1,-1};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                b[0]=i;
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==key){
                b[1]=i;
                break;
            }
        }
        return b;
    }
}
