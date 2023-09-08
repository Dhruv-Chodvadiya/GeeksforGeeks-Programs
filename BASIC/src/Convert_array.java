import java.util.Arrays;

public class Convert_array {
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5};
        int n=a.length;
        comvert(a,n);
    }
    public static void comvert(int a[],int n){
        int temp;
        for(int i = 1; i < n; i++)
        {
            if((i%2 == 0 && a[i-1]<a[i]) || (i % 2 != 0 && a[i-1]>a[i]))
            {
                temp = a[i];
                a[i] = a[i - 1];
                a[i -1] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
