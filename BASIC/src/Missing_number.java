public class Missing_number {
    public static void main(String[] args) {
        int n=4;
        int[] arr={1,2,3};
        int val=miss(arr,n);
        System.out.println(val);
    }
    public static int miss(int[] A,int N){
        int num = (N*(N+1))/2;
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum += A[i];
        }
        int val=num-sum;
        return val;
    }
}
