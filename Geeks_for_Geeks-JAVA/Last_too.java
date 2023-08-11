import java.util.Arrays;

public class Last_too {
    public static void main(String[] args) {
        long[] arr={1,2,3,4,5};
        long[] newArray=pp(arr);
        System.out.println(Arrays.toString(newArray));
    }
    public static long[] pp(long[] arr){
        long[] newArr = new long[arr.length - 2];
        Arrays.sort(arr);
        for(int i = 0; i<arr.length-2; i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
