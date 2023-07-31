
public class Sum_of_Series {
    public static void main(String[] args) {
        int n=5;
        long a=seriesSum(n);
        System.out.println(a);
    }
    public static long seriesSum(int n) {
        long sum=((long)n * ( n + 1 ))/2;
        return  sum;
    }
}