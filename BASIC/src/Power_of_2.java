public class Power_of_2 {
    public static void main(String[] args) {
        long n=8;
        boolean val=check(n);
        System.out.println(val);
    }
    public static boolean check(long n){
        if(n==0){
            return false;
        }
        while(n!=1){
            if(n%2!=0){
                return false;
            }
            n=n/2;
        }
        return true;
    }
}
