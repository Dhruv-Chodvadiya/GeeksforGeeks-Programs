import java.util.HashSet;
import java.util.Set;

public class Union {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int n=a.length;
        int[] b={1,2,3};
        int m=a.length;
        int val=union(a,n,b,m);
        System.out.println(val);
    }
    public static int union(int[] a,int n, int[] b, int m){
        Set<Integer> set=new HashSet<>();
        int k=0;
        for(int i :a){
            if(!set.contains(i)){
                set.add(i);
                k++;
            }
        }
        for(int j:b){
            if(!set.contains(j)){
                set.add(j);
                k++;
            }
        }
        return k;
    }
}
