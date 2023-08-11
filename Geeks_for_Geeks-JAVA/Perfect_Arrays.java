public class Perfect_Arrays {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1};
        boolean pr=perfect(arr);
        System.out.println(pr);
    }
    public static boolean perfect(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] != arr[arr.length-i-1]){
                return false;
            }
        }
        return true;
    }
}
