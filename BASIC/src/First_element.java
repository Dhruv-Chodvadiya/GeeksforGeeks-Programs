import java.util.LinkedHashMap;
import java.util.Map;

public class First_element {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int n=a.length;
        int k=2;
        int val=element(a,n,k);
        System.out.println(val);
    }
    public static int element(int[] a,int n,int k){
        Map<Integer,Integer> map1=new LinkedHashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!map1.containsKey(a[i]))
            {
                if(k==1)
                {
                    return a[i];
                }
                map1.put(a[i],1);
            }
            else
            {
                int b=map1.get(a[i]);
                if(b+1==k)
                {
                    return a[i];
                }
                map1.put(a[i],b+1);
            }
        }
        return -1;
    }
}
