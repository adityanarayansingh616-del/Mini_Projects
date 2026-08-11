import java.util.Scanner;
public class duck
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int d=0;
        System.out.println("Enter a three-digit number:");
        int n=sc.nextInt();
        if(n/1000!=0)
        {
            System.out.println("Invalid.");
            System.exit(0);
        }
        while(n>0)
        {
            d=n%10;
            if(d==0)
            {
            System.out.println("Duck number.");
            System.exit(0);
            }
            n/=10;
        }
        System.out.println("Not a duck number.");
    }
}