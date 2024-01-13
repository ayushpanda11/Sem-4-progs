import java.util.*;
class point
{
    public static void main (String args[])
    {
    System.out.println("CODED BY AYUSH PANDA 2230244");
    Scanner obj= new Scanner (System.in);

    System.out.println("Enter coordinates");
    int x =obj.nextInt();
    int y= obj.nextInt();
    int r = 5;
    int eq= x*x+y*y;
    if (eq>r*r)
    System.out.println("Point lies outside circle ");
    if (eq<r*r)
    System.out.println("Point lies within circle ");
    if (eq==r*r)
    System.out.println("Point lies on the circle ");
    }
}
