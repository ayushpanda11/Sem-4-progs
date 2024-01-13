import java.util.*;
class L2conditional
{
    public static void main (String args[])
    {
    System.out.println("CODED BY AYUSH PANDA 2230244");
    Scanner obj= new Scanner (System.in);
    System.out.println("Enter 3 nos.");
    int a= obj.nextInt();
    int b= obj.nextInt();
    int c= obj.nextInt();
    int grt;
    grt= (a>c)?(a>b?a:b):(b>c?b:c);
    System.out.println(grt+" is greatest\n");
	}
}    
