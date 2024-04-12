// import java.util.*;
import java.io.*;
public class factorial {
    static int fact1(int n)
    {
        if(n==0 || n==1)
            return 1;
        else
            return n*fact1(n-1);
    }
    static int fact2(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
            f*=i;
        return f;
    }
    public static void main(String[] args) throws Exception
    {
        // Scanner sc=new Scanner (System.in);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        int num= Integer.parseInt(br.readLine());
        // int num=sc.nextInt();
        int f1=fact1(num);
        int f2=fact2(num);
        System.out.println(f1+" "+f2);
        // sc.close();
    }
}