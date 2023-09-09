public class strings_rotations {
    public static void main(String[] args) {
        String s1="geeksforgeeks";
        String s2="forgeeksgeeks";
        boolean val=rotation(s1,s2);
        System.out.println(val);
    }
    public static boolean rotation(String s1,String s2){
        if (s1.length() != s2.length()) {
            return false;
        }
        String s1s1 = s1 + s1;

        return s1s1.contains(s2);
    }
}
