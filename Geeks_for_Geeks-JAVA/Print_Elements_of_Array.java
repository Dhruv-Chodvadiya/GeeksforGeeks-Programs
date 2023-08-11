public class Print_Elements_of_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        printt(arr);
    }

    public static void printt(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
