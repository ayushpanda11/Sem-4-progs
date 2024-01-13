import java.util.*;
class fibo
{
    public static void main (String args[])
    {
    System.out.println("CODED BY AYUSH PANDA 2230244");
    Scanner obj= new Scanner (System.in);

    System.out.print("Enter the number of terms");
    int n = obj.nextInt();

    System.out.println("Fibonacci Series:");

        int a = 0, b = 1;
        System.out.print(a+ " " + b+ " ");

        for (int i = 3; i <= n; ++i) 
        {
            int c = a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
        }
}
}