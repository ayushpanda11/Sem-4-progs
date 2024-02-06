import java.util.*;
import java.lang.*;

class L4triangle 
{
    Scanner obj= new Scanner(System.in);
    int a,b,c;
    L4triangle()
    {
        a=0;
        b=0;
        c=0;
    }
    public void input()
    {
        System.out.println("Enter sides");
        a= obj.nextInt();
        b= obj.nextInt();
        c= obj.nextInt();
    }
    public void output()
    {
        if (a==b && a==c)
        System.out.println("Equilateral");
        if ((a==b && b!=c) || (a==c && c!=b) || (b==c && c!=a))
        System.out.println("Isocles");
        if (a!=b && a!=c && b!=c)
        System.out.println("Scalene");
    }
    public static void main(String args[])
    {
        System.out.println("CODED BY AYUSH PANDA 2230244");
        L4triangle ob= new L4triangle();
        ob.input();
        ob.output();   
    }
}
