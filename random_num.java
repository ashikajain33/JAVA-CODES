import java.util.Scanner;
public class random_num {
    public static void main(String[] args) {
        int num=(int)(Math.random()*100);
        Scanner sc= new Scanner(System.in);
        int usernum=0;
        while(usernum>=0){
        System.out.print("Enter a number: ");
        usernum=sc.nextInt();
        if(usernum<0)
        {
            System.out.println("the number is: "+num);
            break;
        }
        else if(usernum<num)
            System.out.println("your number is small");
        else if(usernum>num)
            System.out.println("your number is large");
        else 
        {
            System.out.println("you got the number "+num);
            break;
        }
        }
        sc.close();
    }
}
