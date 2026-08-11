import java.util.Scanner;
public class tri
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch=0,h=0;
        System.out.println("1.Press 1 to get a triangle.");
        System.out.println("2.Press 2 to get an inverted triangle.");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1: System.out.println("Enter height of the triangle:");
            h=sc.nextInt();
            for(int i=1;i<=h;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
            break;
            case 2: System.out.println("Enter height of the triangle:");
            h=sc.nextInt();
            for(int i=h;i>=1;i--)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
            break;
            default: System.out.println("Wrong input.");
        }
    }
}