
public class hanio {
    static int count=0;
    public static void toh(int n,char a,char b, char c){
        if(n>0)
        {
            toh(n-1,a,c,b);
            count+=1;
            System.out.println("move disk from "+a+" to "+b+" using "+c);
            toh(n-1,b,a,c);
        }
    }
    public static void main(String[] args) {
        int n=2;
        char a='A' ,b='B',c='C';
        toh(n,a,b,c);
        System.out.println("the number of steps needed are :");
        System.out.println(count);
       // System.out.println((int)Math.pow(2,n)-1);
    }
}