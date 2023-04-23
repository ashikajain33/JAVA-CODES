class pen{
    String color;
    String type;
    public void write()
    {
        System.out.println("write something");
    }
    public void printcolor()
    {
        System.out.println(this.color);
    } 
}
class Student
{
    String name;
    int age;
    void display()
    {
        System.out.println("Btech CS-AI");
    }
    void printinfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(Student s2)
    {
        this.name=s2.name;
        this.age=s2.age;
       // System.out.println("constructer called");
    }
    Student()
    {
    }
}
public class oops{
    public static void main(String str[]) {
        pen p1=new pen();
        pen p2=new pen();
        p1.color="blue";
        p1.type="gel";
        p2.color="black";
        p2.type="ball";
        p1.write();
        p1.printcolor();
        p2.printcolor();
        System.out.println();
        Student s2=new Student();
        s2.name="aman";
        s2.age=34;
        Student s1=new Student(s2);
        s1.printinfo();
        // Student s1=new Student();
        // s1.name="ashika";
        // s1.age=19;
        // s1.printname();
        // Student s2 = new Student();
        // s2.name="shreya";
        // s2.age=99;
        // s2.printname();
        // s1.display();
    }
}