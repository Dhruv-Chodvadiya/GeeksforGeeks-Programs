public class Sum_of_Array_Elements {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int n=arr.length;
        int sum =sumElement(arr,n);
        System.out.println(sum);
    }
    public static int sumElement(int arr[], int n)
    {
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        return sum;
    }
}
