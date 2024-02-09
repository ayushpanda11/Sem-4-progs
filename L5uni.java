import java.util.*;
class L5uni 
{
        String name, gender;
        Scanner obj = new Scanner (System.in);
        void input1 ()
        {
        System.out.println("Enter name");
        name= obj.next();
        System.out.println("Enter gender");
        gender= obj.next();
        } 
        void display1()
        {
        System.out.println(" Name is "+name);
        System.out.println("Gender is "+ gender);
        }
}
class student extends L5uni
{
        String course ; String branch;
        Scanner obj = new Scanner (System.in);
        void input2 ()
        {
        System.out.println("enter course");
        course= obj.next();
        System.out.println("Enter Branch");
        branch= obj.next();
        } 
        void display2()
        {
        System.out.println ("Course is "+course );
        System.out.println ("Branch is "+branch );
        }
}
class year extends student
{
   int yearid, semid, sgpa;
   void input3()
   {
    System.out.println("Enter year, sem, sgpa");
    yearid= obj.nextInt();
    semid= obj.nextInt();
    sgpa= obj.nextInt();
   }
   void display3()
   {
System.out.println("Year is "+ yearid+ "sem is "+ semid+ "sgpa is "+ sgpa);
   }
}

class MAIN extends year
{
public static void main (String args[])
{
System.out.println("Coded by Ayush Panda 2230244");
    year obb = new year();
    obb.input1();
    obb.input2();
    obb.input3();
    obb.display1();
    obb.display2();
    obb.display3();
}
}