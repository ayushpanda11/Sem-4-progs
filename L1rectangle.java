import java.util.*;
class L1rectangle
{
    public static void main (String a[])
    {
          System.out.println("CODED BY AYUSH PANDA 2230244");
    Scanner obj = new Scanner (System.in);
    System.out.println("Enter l and b");
    int l = obj.nextInt();
    int b = obj.nextInt();
    double area= l*b;
    double peri= 2* (l+b);
    System.out.println("Area is "+ area + "\nPerimeter is "+ peri);
}
}