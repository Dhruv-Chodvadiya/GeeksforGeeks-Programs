public class Replace {
    public static void main(String[] args) {
        int n=1009;
        int val=replace(n);
        System.out.println(val);
    }
    public static int replace(int num){
        int p = 1;
        int ans = 0;
        while(num !=0){
            int d = num % 10;
            if(d == 0){
                d = 5;
            }
            num = num/10;
            ans += d*p;
            p = p*10;
        }
        return ans;
    }
}
