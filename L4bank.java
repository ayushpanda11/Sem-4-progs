import java.util.*;
class L4bank
{
public static void main (String args[])
{
    System.out.println("CODED BY AYUSH PANDA 2230244");
    account ob = new account();
    ob.accept();
    ob.credit();
    ob.debit();
}
}

class account
{
Scanner obj= new Scanner(System.in);
int acc;
String name;
double bal;

void accept()
{
    System.out.println("Enter acc num, name and bal to start with");
    this.acc= obj.nextInt();
    this.name= obj.next();
    this.bal= obj.nextDouble();
}
void credit()
{
    System.out.println("Enter credit amount");
    double credit= obj.nextDouble();
    bal= bal+credit;
    System.out.println("account "+acc+" is credited with "+ credit+" and balance is now "+bal);
}
void debit()
{
    System.out.println("Enter debit amount");
    double debit= obj.nextDouble();
    bal= bal-debit;
    System.out.println("account "+acc+" is debited with "+ debit+" and balance is now "+bal);
}
}

