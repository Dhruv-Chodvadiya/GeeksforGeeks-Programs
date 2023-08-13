import java.util.*;

public class arrays_are_equal {
    public static void main(String[] args) {
        int[] A={0,1,2,3,4};
        int[] B={4,3,2,1,0};
        int N=A.length;
        boolean val=equal(A,B,N);
        System.out.println(val);
    }
    public static boolean equal(int[] A,int[] B,int N){
        Arrays.sort(A);
        Arrays.sort(B);
        int count = 0;

        for(int i=0;i<N;i++){
            if(A[i] == B[i]){
                count++;
            }
        }
        if(count == N){
            return true;
        }else{
            return false;
        }
    }
}
