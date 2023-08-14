public class Prime_Number {
    public static void main(String[] args) {
        int n=5;
        int val=prime(n);
        System.out.println(val);
    }
    public static int prime(int N){
        if(N==1){
            return 0;
        }
        for(int i=2;i<=N/2;i++){
            if(N%i==0){
                return 0;
            }
        }
        return 1;
    }
}
