public class Print_pat {
    public static void main(String[] args) {
        int n=2;
        pritnPat(n);
    }
    public static void pritnPat(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>0;j--){
                for(int z=i;z<n;z++){
                    System.out.print(j+" ");
                }
            }
            System.out.println("$");
        }
    }
}
