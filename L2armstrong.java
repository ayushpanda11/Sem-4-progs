import java.util.*;
class L2armstrong
{
    public static void main (String args[])
    {
    System.out.println("CODED BY AYUSH PANDA 2230244");
    Scanner obj= new Scanner (System.in);

    System.out.println("Enter the num");
    int n = obj.nextInt();
    int n1=n;
    int sum=0, d;

    while (n1!=0)
    {
        d= n1%10;
        sum= sum + (d*d*d);
        n1=n1/10;
    }
    if (sum==n)
    System.out.println("Armstrong number");
    else
    System.out.println("NOT an Armstrong number");
    }
}