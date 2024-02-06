import java.util.*;

class L3shape2 
{
    String name;

    static class square {
        int side;

        int sqarea() 
        {
            return side * side;
        }
    }

    static class rectangle {
    int length;
    int width;

    int recarea() {
        return length * width;
    }

    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter shape name in lowercase");
        String str = obj.nextLine();
        L3shape2 ob2 = new L3shape2();
        ob2.name = str;

        switch (ob2.name) {
            case "square":
                square sq = new square();
                System.out.print("Enter the side of square: ");
                sq.side = obj.nextInt();
                System.out.println("Area of square " + sq.sqarea());
                break;

            case "rectangle":
                rectangle rec = new rectangle();
                System.out.print("Enter length: ");
                rec.length = obj.nextInt();
                System.out.print("Enter width ");
                rec.width = obj.nextInt();
                System.out.println("Area of rectangle is " + rec.recarea());
                break;

            default:
                System.out.println("Invalid shape entered!");
        }
    }
}
