public class Squares {
    public static void main(String[] args) {
        int m=2;
        int n=2;
        long val=square(m,n);
        System.out.println(val);
    }
    public static long square(int m,int n){
        long ans = 0;
        while(m > 0 && n > 0){
            int prod = m * n;
            m--;
            n--;
            ans += prod;
        }
        return ans;
    }
}
