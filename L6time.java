public class L6time
{
int h,m,s;
L6time()
{}
L6time(int H)
{h=H;}
L6time(int H, int M)
{h=H;
m=M;}
L6time(int H, int M,int S)
{h=H;
m=M;
s=S;}

void display()
{
    System.out.print(h+":");
    System.out.print(m+":");
    System.out.print(s);
    System.out.println();
}

public static void main(String args[]) 
{
System.out.println("CODED BY AYUSH PANDA 2230244");
L6time ob1 = new L6time();
L6time ob2 = new L6time(11);
L6time ob3 = new L6time(11,30);
L6time ob4 = new L6time(12,30,24);

ob1.display();
ob2.display();
ob3.display();
ob4.display();
}
}
