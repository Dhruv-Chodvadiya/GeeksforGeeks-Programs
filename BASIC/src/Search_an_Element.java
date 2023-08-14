public class Search_an_Element {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int x=3;
        int val=search(arr,x);
        System.out.println(val);
    }
    public static int search(int[] arr,int X){
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==X)
                return i;
        }
        return -1;
    }
}
