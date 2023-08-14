public class Searching {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6};
        int n=5,k=6;
        int val= search(arr,n,k);
        System.out.println(val);
    }
    public static int search(int[] arr,int N,int K){
        for(int i=0;i<N;i++){
            if(arr[i]==K){
                return 1;
            }
        }
        return -1;
    }
}
