import java.util.*;
class L6Student
{
    int roll; String name;
    L6Student ()
    {
        roll=2230244;
        name= "Ayush";
    }
    void info()
    {
    System.out.println("Roll is "+roll);
    System.out.println("Name is "+ name);
    }
}
class firstsem extends L6Student
{   double sgpa;
    firstsem()
    {
        sgpa= 7.54;
    }
    void info()
    {
    L6Student ob = new L6Student();
    ob.info();
    System.out.println("SGPA is "+sgpa);
    }
}
class secondsem extends L6Student
{   double sgpa;
    secondsem()
    {
        sgpa= 7.50;
    }
    void info()
    {
    L6Student ob = new L6Student();
    ob.info();
    System.out.println("SGPA is "+sgpa);
    }
}
class thirdsem extends L6Student
{   double sgpa;
    thirdsem()
    {
        sgpa= 7.20;
    }
    void info()
    {
    L6Student ob = new L6Student();
    ob.info();
    System.out.println("SGPA is "+sgpa);
    }
}
class MAIN 
{
    public static void main(String args[]) 
    {
    L6Student ob = new L6Student();
    firstsem ob1 = new firstsem();
    secondsem ob2 = new secondsem();
    thirdsem ob3 = new thirdsem();
    Scanner obj = new Scanner (System.in);
    System.out.println("enter sem");
    int ch= obj.nextInt();
    switch (ch) 
    {
    case 1:
    ob1.info();
    break;
    case 2:
    ob2.info();
    break;
    case 3:
    ob3.info();
    break;
    default: System.out.println("invalid input");
    break;
    }
    }
}
