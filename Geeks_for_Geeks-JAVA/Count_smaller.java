public class Count_smaller {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int x=3;
        int small=count(arr,x);
        System.out.println(small);
    }
    public static int count(int[] arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=x){
                count++;
            }
        }
        return count;
    }
}
