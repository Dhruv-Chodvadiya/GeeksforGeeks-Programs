public class Java_Arrays {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        String set1=set(arr);
        System.out.println(set1);
    }
    public static String set(int[] arr){
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum= sum+arr[i];
        }
        return String.format("%.2f",sum/arr.length);
    }
}
