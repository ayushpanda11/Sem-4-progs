import java.util.*;
class L5uni2
    {
            String name, gender;
            Scanner obj = new Scanner (System.in);
            void input1 ()
            {
            System.out.println("Enter name");
            name= obj.next();
            System.out.println("Enter gender");
            gender= obj.next();
            } 
            void display1()
            {
            System.out.println(" Name is "+name);
            System.out.println("Gender is "+ gender);
            }
    }
    class student extends L5uni2
    {
            String course ; String branch;
            Scanner obj = new Scanner (System.in);
            void input2 ()
            {
            System.out.println("enter course");
            course= obj.next();
            System.out.println("Enter Branch");
            branch= obj.next();
            } 
            void display2()
            {
            System.out.println ("Course is "+course );
            System.out.println ("Branch is "+branch );
            }
    }
    class year extends student
    {
       int yearid, semid, sgpa;
       void input3()
       {
        System.out.println("Enter year, sem, sgpa");
        yearid= obj.nextInt();
        semid= obj.nextInt();
        sgpa= obj.nextInt();
       }
       void display3()
       {
    System.out.println("Year is "+ yearid+ "sem is "+ semid+ "sgpa is "+ sgpa);
       }
    }

    class employee extends L5uni2
    {
       int employeeid;
       void input4 ()
       {
       System.out.println("enter emp id");
       employeeid= obj.nextInt();
       } 
       void display4()
       {
       System.out.println ("Emp id is "+employeeid );
       }
    }
    class teaching extends employee
    {
        String desg;
        void input5 ()
       {
       System.out.println("enter designation");
       desg= obj.next();
       } 
       void display5()
       {
       System.out.println ("Designation is "+desg);
       }
    }
    class nonteaching extends employee
    {
        String desg;
        void input6 ()
       {
       System.out.println("enter designation");
       desg= obj.next();
       } 
       void display6()
       {
       System.out.println ("Designation is "+desg);
       }
    }
    class MAIN extends year
    {
    public static void main (String args[])
    {
        Scanner obj= new Scanner(System.in);
    System.out.println("Coded by Ayush Panda 2230244");
        year obb = new year();
        teaching obb2 = new teaching();
        nonteaching obb3= new nonteaching();

        System.out.println("Enter 1 for student, 2 for teaching staff and 3 for nonteaching staff");
        int ch= obj.nextInt();
        switch (ch) 
        {
            case 1:
            obb.input1();
            obb.input2();
            obb.input3();
            obb.display1();
            obb.display2();
            obb.display3();
            break;
            case 2:
            obb2.input1();
            obb2.input4();
            obb2.input5();
            obb2.display1();
            obb2.display4();
            obb2.display5();
            break;
            case 3:
            obb3.input1();
            obb3.input4();
            obb3.input6();
            obb3.display1();
            obb3.display4();
            obb3.display6();
            break;
            default: System.out.println("Wrong choice nigga");break;
        }
        
    }
    }