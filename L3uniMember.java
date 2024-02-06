import java.util.*;
class L3uniMember 
{
    String name;
    String gender;
    static class student
    {
        int roll;
    }
    static class faculty
    {
        int EID; 
    }
    
public static void main(String args[])
{
    System.out.println("CODED BY AYUSH PANDA 2230244");
    Scanner ob= new Scanner(System.in);
    L3uniMember ob2= new L3uniMember();
    System.out.println("Enter name");
    ob2.name= ob.nextLine();    
    System.out.println("Enter gender");
    ob2.gender= ob.nextLine();    

    System.out.println("Enter faculty or studnet");
    String str= ob.nextLine();

    switch(str)
    {
        case "student":
        student ob3= new student();
        System.out.println("Enter roll");
        ob3.roll= ob.nextInt();
        System.out.println(" Name is "+ob2.name+ " gender is "+ ob2.gender+ " Roll is "+ob3.roll);
        break;

        case "faculty":
        faculty ob4= new faculty();
        System.out.println("Enter FID");
        ob4.EID= ob.nextInt();
        System.out.println(" Name is "+ob2.name+ " gender is "+ ob2.gender+ " Roll is "+ob4.EID);
        break;

        default:
        System.out.println("Invalid input");
    }
}
}
