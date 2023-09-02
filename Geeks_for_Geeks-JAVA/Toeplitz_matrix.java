public class Toeplitz_matrix {
    public static void main(String[] args) {
        int mat[][]={
                {6,7,8},
                {4,6,7},
                {1,4,6}
        };
        int N=mat.length;
        int M=mat[0].length;
        boolean val=mat(mat,N,M);
        System.out.println(val);
    }
    public static boolean mat(int mat[][],int N,int M){
        for(int i=0; i<N-1; i++) {
            for(int j=0; j<M-1; j++) {
                if((mat[i][j]) != (mat[i+1][j+1])) {
                    return false;
                }
            }
        }
        return true;
    }
}
