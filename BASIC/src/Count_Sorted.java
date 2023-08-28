public class Count_Sorted {
    public static void main(String[] args) {
        int[][] Mat={
                {1,2,3},
                {4,5,6},
                {7,8,7}
        };
        int N=Mat.length;
        int M=Mat[0].length;
        int count=0;
        for(int i=0;i<N;i++){
            int dec=0;
            int inc=0;
            for(int j=0;j<M-1;j++){
                if(Mat[i][j]>Mat[i][j+1]){
                    dec++;
                }
                if(Mat[i][j]<Mat[i][j+1]){
                    inc++;
                }
            }
            if(inc==M-1||dec==M-1){
                count++;
            }
        }
        System.out.println(count);
    }
}
