public class Print_alternate_element {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        alternate(arr);
    }
    public static void alternate(int[] arr){
        for(int i=0;i<arr.length;i+=2){
            System.out.println(arr[i]);
        }
    }
}
