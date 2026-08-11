import java.util.Scanner;
public class EvenPal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int revnum=0,d=0,s=0;
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        for(int i=n;i!=0;i/=10)
        {
            d=i%10;
            revnum=revnum*10+d;
            s+=d;
        }
        if(revnum==n && s%2==0)
        System.out.println(n+" is an EvenPal number.");
        else
        System.out.println(n+" is not an EvenPal number.");
    }
}