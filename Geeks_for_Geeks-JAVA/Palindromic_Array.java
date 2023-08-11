public class Palindromic_Array {
    public static void main(String[] args) {
        int[] arr={121,131,141,151};
        //1 = true Array is palindrom
        //0 = false Array is not palindrom
        int num = val(arr);
        System.out.println(num);
    }
    public static int val(int[] arr){
        for(int i=0;i<arr.length;i++){
            int rev=0;
            int nums=arr[i];
            while (arr[i]!=0){
                int r=arr[i]%10;
                rev =rev*10+r;
                arr[i]=arr[i]/10;
            }
            if(rev!=nums){
                return 0;
            }
        }
        return 1;
    }
}
