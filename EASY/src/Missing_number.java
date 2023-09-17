public class Missing_number {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int val=missing(arr,n);
        System.out.println(val);
    }
    public static int missing(int[] array,int n){
        int totalSum = n * (n + 1) / 2;
        // Calculate the sum of elements in the array
        int arraySum = 0;
        for (int num : array) {
            arraySum += num;
        }
        // The missing number will be the difference between the totalSum and arraySum
        return totalSum - arraySum;
    }
}
