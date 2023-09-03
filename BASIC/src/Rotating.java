import java.util.Arrays;

public class Rotating {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int N=arr.length;
        int D=2;
        rotate(arr,N,D);
//        System.out.println(Arrays.toString(rotat));
    }
    public static void rotate(int[] arr,int n,int d){
        int [] newArray=new int[n];
        int a=0;
        for(int i=d;i<n;i++){
            newArray[a]=arr[i];
            a++;
        }
        for(int i=0;i<d;i++){
            newArray[a]=arr[i];
            a++;
        }
        for(int i=0;i<n;i++){
            arr[i]=newArray[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
