public class Second_Largestt {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int n=arr.length;
        int val=larg(arr,n);
        System.out.println(val);
    }
    public static int larg(int[] arr,int n){
        int largest = arr[0];
        int secondLargest = -1;
        for(int i = 0; i<n; i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
