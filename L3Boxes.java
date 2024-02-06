class BoxA
{
int l,b,h;

double volume ()
{return l*b*h;}

}

class L3Boxes
{
    public static void main (String args[])
    {
        System.out.println("CODED BY AYUSH PANDA 2230244");
        double v1, v2;
        BoxA ob1= new BoxA();
        ob1.l= 5;
        ob1.b= 10;
        ob1.h= 6;
        v1= ob1.volume();
        System.out.println("Vol of 1st instance is "+v1);

        BoxA ob2= new BoxA();
        ob2.l= 6;
        ob2.b= 10;
        ob2.h= 15;
        v2= ob2.volume();
        System.out.println("Vol of 2nd instance is "+v2);
    }
}