import java.util.*;
class L5prog3
{
    String name, gender;
    L5prog3 ()
    {
        name="null";
        gender="null";
    }
    L5prog3 (String n, String g)
    {
        name= n;
        gender= g;
    }
    void display()
    {
    System.out.println(" Name is "+name);
    System.out.println("Gender is "+ gender);
    }
}
    class Student extends L5prog3
{
    int roll; String branch;
    Student ()
    {
        roll=0;
        branch= "null";
    }
    Student (int r, String b)
    {
        roll=r;
        branch= b;
    }
    void display2()
    {
    System.out.println("Roll is "+roll);
    System.out.println("branch is "+ branch);
    }
}

class first extends Student
{
    void year1()
    {
        System.out.println("First year....");
    }
}
class firstsem extends first
{
    void subjects()
    {
        System.out.println("DELA, EVS, PHY, ML, SCLS, NS, PHLAB, C LAB");
    }
}

class second extends Student
{
    void year2()
    {
    System.out.println("second year....");
    }
}
class third extends Student
{
    void year3()
    {
    System.out.println("third year....");
    }
}
class fourth extends Student
{
    void year4()
    {
    System.out.println("fourth year....");
    }
}

class go extends Student
{
public static void main(String args[]) 
{
    Scanner obj = new Scanner(System.in);
    System.out.println("CODED BY AYUSH PANDA 2230244");
    System.out.println ("Enter name via para");
    String NAME= obj.next();
    System.out.println ("Enter gender via para");
    String GENDER= obj.next();
    System.out.println("enter roll via para");
    int ROLL= obj.nextInt();
    System.out.println("Enter Branch via para");
    String BRANCH= obj.next();
    
    L5prog3 ob11= new L5prog3(NAME,GENDER);
    Student ob22= new Student(ROLL,BRANCH);
    firstsem ob = new firstsem();
    ob11.display();
    ob22.display2();
    ob.year1();
    ob.subjects();
    second ob2 = new second();
    ob2.year2();
    third ob3 = new third();
    ob3.year3();
    fourth ob4 = new fourth();
    ob4.year4();
}
}