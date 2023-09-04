public class Count_zeros {
    public static void main(String[] args) {
        int mat[][]={
                {0,0,0},
                {0,0,1},
                {0,1,1}
        };
        int N=3;
        int val=count(mat,N);
        System.out.println(val);
    }
    public static int count(int[][] A,int N){
        int count=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(A[i][j]==0){
                    count++;
                }
            }
        }
        return count;
    }
}
