public class Third_largest {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;

        int val=largest(arr,n);
        System.out.println(val);
    }
    public static int largest(int[] a,int n){
        int F1 = Integer.MIN_VALUE;
        int F2 = Integer.MIN_VALUE;
        int F3 = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(a[i]>F1){
                F3=F2;
                F2=F1;
                F1=a[i];
            }
            else if(a[i]>F2){
                F3=F2;
                F2=a[i];
            }
            else if(a[i]>F3){
                F3=a[i];
            }
        }
        return F3;
    }
}
