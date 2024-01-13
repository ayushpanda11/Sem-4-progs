import java.util.*;
class L1seconds
{
    public static void main (String a[])
    {
    System.out.println("CODED BY AYUSH PANDA 2230244");
    Scanner obj = new Scanner (System.in);
    System.out.println("Enter seconds");
    int secs = obj.nextInt();
    int hours= secs/3600;
    secs= secs%3600;
    int mins= secs/60;
    secs= secs%60;
    System.out.println("Time in format is " + hours +" Hours "+ mins+ " Mins "+secs+" Secs ");
}
}