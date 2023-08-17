public class Last_index_1 {
    public static void main(String[] args) {
        String val= "00001";
        int n=check(val);
        System.out.println(n);
    }
    public static int check(String n){
        int value = n.lastIndexOf("1");
        return value;
    }
}
