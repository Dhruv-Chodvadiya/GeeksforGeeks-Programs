import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        float[] ave=pr(arr);
        System.out.println(Arrays.toString(ave));
    }
    public static float[] pr(int[] arr){
        float ans[]=new float[arr.length];
        float sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            ans[i]=sum/(i+1);
        }
        return ans;
    }
}
