public class Multiply_matrices {
    public static void main(String[] args) {
        int[][] A={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] B={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
