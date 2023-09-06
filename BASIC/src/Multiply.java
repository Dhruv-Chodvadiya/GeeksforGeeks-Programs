public class Multiply {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int val=multiply(arr,n);
        System.out.println(val);
    }
    public static int multiply (int arr[], int n) {
        int s1 = 0;
        int s2 = 0;
        int prod = 0;

        for (int i = 0; i < n / 2; i++) {
            s1 += arr[i];
        }

        for (int j = n / 2; j < n; j++) {
            s2 += arr[j];
        }

        prod = s1 * s2;

        return prod;
    }
}
