import java.util.*;
public class fibonacci {
    //recursive
    static int fibonaci(int n)
    {
        if(n<=1)
        return n;
        return fibonaci(n-1)+fibonaci(n-2);
    }
    //non recursive
    static int fibbo(int n)
    {
        int i=1,t1=0,t2=1,t3;
        while(i<=n)
        {
           // System.out.println(t1);
            t3=t1+t2;
            t1=t2;
            t2=t3;
            i++;
        }
        return t1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int fib=fibonaci(num);
        int n=fibbo(num);
        System.out.println("recursive:\n"+fib);
        System.out.println("non recursive:\n"+n);
        System.out.println("recursive:\n");
        for(int i=1;i<=num;i++)
        System.out.println(fibonaci(i));
        sc.close();
    }
}
