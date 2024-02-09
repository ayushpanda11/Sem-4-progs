class L5prog3
{
    String name, gender;
    L5prog3 ()
    {
        name="null";
        gender="null";
    }
    void display()
    {
    System.out.println(" Name is "+name);
    System.out.println("Gender is "+ gender);
    }
}
    class Student extends L5prog3
{
    int roll; String branch;
    Student ()
    {
        roll=0;
        branch= "null";
    }
    void display2()
    {
    System.out.println("Roll is "+roll);
    System.out.println("branch is "+ branch);
    }
}

class Main
{
public static void main(String args[]) 
{
    System.out.println("CODED BY AYUSH PANDA 2230244");
    L5prog3 ob11= new L5prog3();
    Student ob22= new Student();
    ob11.display();
    ob22.display2();
}
}