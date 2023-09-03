public class Balanced_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int N=arr.length;
        long val=balamce(arr,N);
        System.out.println(val);
    }
    public static long balamce(int[] a,int n){
        int c = n/2;
        long sum1 = 0;
        long sum2 = 0;

        for(int i=0;i<c;i++){
            sum1+=a[i];
        }

        for(int j = c;j<n;j++){
            sum2+=a[j];

        }

        if(sum1>sum2)
            return sum1-sum2;
        else
            return sum2-sum1;
    }
}
