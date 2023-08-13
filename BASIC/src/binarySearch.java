public class binarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int k=4;
        int val=search(arr,n,k);
        System.out.println(val);
    }
    public static int search(int[] arr,int n, int k){
        int start=0, end=n-1,mid;
        while (start<=end){
            mid = (start+end)/2;
            if(arr[mid]==k){
                return mid;
            }else if(arr[mid]<k){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
