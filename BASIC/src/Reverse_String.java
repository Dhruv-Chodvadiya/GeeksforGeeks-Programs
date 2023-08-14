public class Reverse_String {
    public static void main(String[] args) {
        String name="Geeks";
        String val=reverse(name);
        System.out.println(val);
    }
    public static String reverse(String str){
        int l = str.length();
        char arr[] = str.toCharArray();
        String ret="";

        for(int i=l-1; i>=0; i-- ){

            ret+= arr[i];

        }

        return ret;
    }
}
