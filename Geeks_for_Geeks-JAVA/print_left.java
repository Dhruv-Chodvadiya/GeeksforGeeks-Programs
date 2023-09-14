import java.util.Arrays;

public class print_left {
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 4, 2, 9, 5};
        int n = arr.length;
        Arrays.sort(arr);
        if(n%2==0){
            System.out.println(arr[(int)(n/2)-1]);
            return ;
        }
        else
            System.out.println(arr[(int)n/2]);
            return ;
    }
}
