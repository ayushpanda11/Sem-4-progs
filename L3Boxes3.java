class BoxC
{
double l,b;
double area()
    {return l*b;}
double perimeter()
    {return 2*(l+b);}
}

class L3Boxes3
{
    public static void main (String args[])
    {
        System.out.println("CODED BY AYUSH PANDA 2230244");
        BoxC obj= new BoxC();
        obj.l= 5;
        obj.b= 10;
        double x= obj.area();
        double y= obj.perimeter();
        System.out.println("Perimeter is "+y);
        System.out.println("Area is "+x);
    }
}
