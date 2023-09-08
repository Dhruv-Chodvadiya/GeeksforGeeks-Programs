public class Product {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        long mod=1000000007L;
        long val=pro(arr,n,mod);
        System.out.println(val);
    }
    public static long pro(int[] arr,int n ,long mod){
        long res=1;
        for(int i=0;i<n;i++){
            res = res * arr[i] %mod;
        }
        return res;
    }
}
