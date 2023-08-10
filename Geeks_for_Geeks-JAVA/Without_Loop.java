public class Without_Loop {
    public static void main(String[] args) {
        int n=10;
        printt(n);
    }
    public static void printt(int n){
        if(n==0){
            return;
        }
        printt(n-1);
        System.out.print(n+" ");
    }
}
