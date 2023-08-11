public class Sum_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int sum=array(arr);
        System.out.println(sum);
    }
    public static int array(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=arr[i];
        }
        return ans;
    }
}
