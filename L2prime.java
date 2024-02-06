class L2prime
{
    public static void main (String args[])
    {
        System.out.println("CODED BY AYUSH PANDA 2230244");
        for (int i=1; i<20; i++ )
        {
            int c=0;
            for (int j=1; j<=i;j++)
            {
                if (i%j==0)
                c++;
            }
            if (c<=2)
            System.out.print(i+ " ");
        }
    }
}