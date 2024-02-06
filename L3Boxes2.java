class BoxB
{
double volume(int l,int b, int h)
{return l*b*h;}
}

class L3Boxes2
{
    public static void main (String args[])
    {
        System.out.println("CODED BY AYUSH PANDA 2230244");
        BoxB ob1= new BoxB();
        double v1= ob1.volume(2, 5, 10);
        System.out.println("Vol of 1st instance using parain is "+v1);

        BoxB ob2= new BoxB();
        double v2= ob2.volume(3,5,10);
        System.out.println("Vol of 2nd instance using parain is "+v2);
    }
}
