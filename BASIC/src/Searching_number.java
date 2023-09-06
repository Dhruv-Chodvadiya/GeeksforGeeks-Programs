public class Searching_number {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int k=5;
        int val=search1(arr,n,k);
        System.out.println(val);
    }
    public static int search1(int arr[], int n, int k) {
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                return i+1;
            }
        }
        return -1;
    }
}
