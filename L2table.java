import java.util.*;
import java.text.DecimalFormat;
import java.lang.Math;
class L2table
{
    public static void main (String args[])
    {
    System.out.println("CODED BY AYUSH PANDA 2230244");
    DecimalFormat df= new DecimalFormat("#.##");
    double x[]= new double[100], y[]= new double [100];
    double e= 2.718;
    x[0]=0.0;
    for (int i=0; i<10;i++)
    {
        y[i]= Math.pow(e,-1*x[i]);
        x[i+1]= x[i]+0.1;
    }
    System.out.print("\n x= ");
    for (int i=0; i<10;i++)
    {
       System.out.print(df.format(x[i])+" ");
    }
    System.out.print("\n y= ");
    for (int i=0; i<10; i++)
    {
       System.out.print(df.format(y[i])+" ");
    }
    }
    }