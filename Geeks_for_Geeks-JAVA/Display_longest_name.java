public class Display_longest_name {
    public static void main(String[] args) {
        String[] arr={"Dhruv","meet","nishant","jay"};
        String l=large(arr);
        System.out.println(l);
    }
    public static String large(String[] arr){
        String l=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i].length()>l.length()){
                l=arr[i];
            }
        }
        return l;
    }
}
