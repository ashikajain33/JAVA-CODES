import java.util.Scanner;
class stack{						  //variable used to store tupe of operation	 		
    public static void main(String[] args) 
    {
        mystack m=new mystack();
        Scanner scan= new Scanner(System.in);
        System.out.println("Stack Operation from Array");
	    System.out.println("enter the size of stack:");
        m.size=scan.nextInt();
        int choice;
	    while( true )
	    {
		    System.out.println("enter your choice:");
		    choice=scan.nextInt();
		    if(choice==1)
		    {
			    System.out.println("Enter item to be inserted:");
			    m.PUSH(scan.nextInt());
		    }
		    else if(choice==2)
			    m.POP();
		    else if(choice==3)
                m.display();
		    else if(choice==4)
		    {
			    System.out.println("Exit\n");
			    break;
		    }
		    else
                System.out.println("invalid choice\n");
	    }
        scan.close();
    }
}

class mystack 
{
    int size;
	int s[]=new int[size];
	int top=-1;
	mystack()
	{
		top = -1;        //indicate it's empty
	}
    
   public boolean isEmpty()
    {
        if( top<0 )
            return true;
        else
            return false;
    }

    public boolean isFull()
    {
        if( top>=size)
            return true;
        else
            return false;    
    }
    public void PUSH (int x)
    {
        if( isFull() ){
		System.out.println("OVERFLOW\n");
        return ;
        }
	    else
		    s[++top]=x; 
    }

    public int POP()
    {
        if( isEmpty() ){
		    System.out.println("UNDERFLOW\n");
            return 0;
    }
	    else
		    return s[top--];	    
    }
    
    public void display()
    {
        if(top<=-1)
            System.out.println("UNDERFLOW\n");
        else
        {
            System.out.println("stack:\n");
            for(int i=top;i>=0;i--)
            System.out.println(s[i]);
        }   
    }
}
