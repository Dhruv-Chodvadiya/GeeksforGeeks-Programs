import java.util.Arrays;

public class Sorted_matrix {
    public static void main(String[] args) {
        int[][] mat={
                {4,5,6},
                {1,2,3},
                {7,8,9}
        };
        int N=3;
        int newmat[][]=sortmat(mat,N);
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(newmat[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static int[][] sortmat(int[][] Mat,int N){
        int[] arr=new int[N*N];
        int temp=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[temp++]=Mat[i][j];
            }
        }
        Arrays.sort(arr);
        temp=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                Mat[i][j]=arr[temp++];
            }
        }
        return Mat;
    }
}
