public class Sums {
    public static void main(String[] args) {
        int[][] Mat={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int N=Mat.length;
        int M=Mat[0].length;

        int s=0,s1=0;
        for(int i=0;i<=N-1;i++){
            int c=0;
            for(int j=0;j<=M-1;j++){
                if(i==0){
                    s=s+Mat[i][j];
                }
            }
            s1=s1+Mat[i][c++];
        }
        System.out.println(s==s1?1:0);
    }
}
