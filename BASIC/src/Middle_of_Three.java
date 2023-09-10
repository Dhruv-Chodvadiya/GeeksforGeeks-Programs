public class Middle_of_Three {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
        int val=mid(a,b,c);
        System.out.println(val);
    }
    public static int mid(int A,int B,int C){
        if(A>B&&A<C||A>C&&A<B)
        {
            return A;
        }
        else if(B>C&&B<A||B>A&&B<C)
        {
            return B;
        }
        else
        {
            return C;
        }
    }
}
