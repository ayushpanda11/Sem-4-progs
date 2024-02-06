import java.util.*;

class L4complex 
{
public static void main(String args[]) 
{
System.out.println("CODED BY AYUSH PANDA");
Scanner obj = new Scanner(System.in);
System.out.println("enter the real part ");
int a = obj.nextInt();
System.out.println("enter the imaginary part ");
int b = obj.nextInt();
System.out.println("enter the real part of other num ");
int c = obj.nextInt();
System.out.println("enter the imaginary part of other num ");
int d = obj.nextInt();
System.out.println(+a + " + i" + b);
int sumreal = a + c;
int sumimaginary = b + d;
System.out.println("sum =" + sumreal + " + i" + sumimaginary);
int prodreal = a * c - b * d;
int prodimaginary = a * d + c * b;
System.out.println("product is " + prodreal + " +i" + prodimaginary);
}
}