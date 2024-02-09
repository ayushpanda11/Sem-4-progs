import java.util.*;
class L5prog2
{
    String name, gender;
    Scanner obj = new Scanner (System.in);
    void name ()
    {
    System.out.println("Enter name");
    name= obj.next();
    } 
    void gender ()
    {
    System.out.println("Enter gender");
    gender= obj.next();
    }
    void display()
    {
    System.out.println(" Name is "+name);
    System.out.println("Gender is "+ gender);
    }
}
    class Student extends L5prog2 
{
    int roll; String branch;
    Scanner obj = new Scanner (System.in);
    void roll ()
    {
    System.out.println("enter roll");
    roll= obj.nextInt();
    } 
    void branch()
    {
    System.out.println("Enter Branch");
    branch= obj.next();
    } 
    void display2()
    {
    System.out.println (" Roll is "+roll );
    System.out.println (" Branch is "+branch );
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
    System.out.println("CODED BY AYUSH PANDA 2230244");
    firstsem ob = new firstsem();
    ob.name();
    ob.gender();
    ob.roll();
    ob.branch();
    ob.display();
    ob.display2();
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