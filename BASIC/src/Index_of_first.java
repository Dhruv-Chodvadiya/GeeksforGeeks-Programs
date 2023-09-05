public class Index_of_first {
    public static void main(String[] args) {
        int[] arr={0,0,1,0,1,1,1,0,0,0};
        int n=arr.length;
        long val=index(arr,n);
        System.out.println(val);
    }
    public static long index(int[] arr,int n){
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                return i;
            }
        }
        return -1;
    }
}
