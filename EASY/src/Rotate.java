public class Rotate {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n=3;
        rotate(arr,n);
    }
    public static void rotate(int[][] matrix,int n){
        for(int i =0; i<n/2;i++){
            for(int j =i; j<n-i-1;j++){
                int temp = matrix[i][j];

                matrix[i][j] = matrix[j][n-i-1];
                matrix[j][n-i-1] = matrix[n-1-i][n-j-1];
                matrix[n-1-i][n-j-1] = matrix[n-j-1][i];
                matrix[n-j-1][i] = temp;

            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
