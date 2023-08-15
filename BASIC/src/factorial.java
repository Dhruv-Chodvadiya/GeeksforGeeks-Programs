public class factorial {
    public static void main(String[] args) {
        int n=5;
        long val=fact(n);
        System.out.println(val);
    }
    public static long fact(int N){
        long ans=1;
        for(int i=N;i>=1;i--){
            ans*=i;
        }
        return ans;
    }
}
