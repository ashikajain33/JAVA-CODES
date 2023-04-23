// abstract method is that the method doesn't have any body.
//for inheritance in abstract class chaining construction is need for consuptial purpose
abstract class X2       //abstract class
{
    int i=5;
    X2()
    {
        System.out.println("in a");
    }
    abstract void disp1();        //abstarct method
    void disp2()
    {
        System.out.println("in X");
    }
}
class Z2 extends X2{                        //complete class
    int i=7;        
    Z2()
    {
        System.out.println("in b");
    }
    void disp1()
    {
        System.out.println("in Z");
    }
}
class abstrac
{
    public static void main(String[] args) {
        //      there is no calling of ABSTRACT FUNCTION bacause it is not allowed
        Z2 zy=new Z2();
        X2 xy=new Z2();  //object is of child and reference is of parent
        zy.disp1();
        zy.disp2();
        xy.disp1();
        xy.disp2();
        System.out.println(xy.i);
        System.out.println(zy.i);
        //X x = new X();        cann't be created
    }
}

//abstract class cann't have object
//we can make normal method in abstract method
//child will be compalsary to have the same method as parent abstract method