class L6pattern 
{
    void pattern(boolean a)
    {

    }
    int a,b,c;
    void Axx(int A)
    {System.out.println("0,1");}
    void Bxx (int A,int B)
    {System.out.println("00,01,10,11");}
    void Cxx(int A,int B,int C)
    {System.out.println("000, 001, 010, 011, 100, 101, 110, 111");}


    public static void main(String args[]) 
    {
    L6pattern ob = new L6pattern();
    ob.Axx(0);
    }
}
