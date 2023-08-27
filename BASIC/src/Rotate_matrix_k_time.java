public class Rotate_matrix_k_time {
    public static void main(String[] args) {
        int[][] Mat={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int K=1;
        int n=Mat.length;
        int m=Mat[0].length;
        int[][] ans=new int[n][m];

        int a=0,b=0;
        K=K%Mat[0].length;

        for(int i=0;i<n;i++,a++){
            for(int j=K;j<m;j++){
                ans[a][b++] = Mat[i][j];
            }
            for(int l=0;l<K;l++){

                ans[a][b++] = Mat[i][l];
            }
            b=0;
        }

        for(int i=0;i< Mat.length;i++){
            for(int j=0;j<Mat[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
