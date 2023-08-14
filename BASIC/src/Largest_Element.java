public class Largest_Element {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int val=largest(arr,n);
        System.out.println(val);
    }
    public static int largest(int[] arr, int n){
        int larg=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>larg){
                larg=arr[i];
            }
        }
        return larg;
    }
}
