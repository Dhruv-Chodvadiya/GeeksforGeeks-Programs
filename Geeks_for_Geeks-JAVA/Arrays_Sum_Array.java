public class Arrays_Sum_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        long sum=sumArray(arr);
        System.out.println(sum);
    }

    public static long sumArray(int[] arr) {
        long ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=arr[i];
        }
        return ans;
    }
}
