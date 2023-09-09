public class Exceptionally_odd {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int val=pro(arr,n);
        System.out.println(val);
    }
    public static int pro(int[] arr,int n ){
        int xor=0;

        for(int i=0;i<n;i++)
        {
            xor=arr[i]^xor;
        }
        return xor;
    }
}
