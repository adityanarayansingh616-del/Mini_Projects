import java.util.Scanner;
public class even_odd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=0,l=0,s=9,sum=0,d=0;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        for(int i=n;i>0;i/=10)
        {
            d=i%10;
            if(d>l)
            l=d;
            if(d<s)
            s=d;
        }
        sum=l+s;
        if(sum%2==0)
        System.out.println("Sum is even.");
        else
        System.out.println("Sum is odd.");
    }
}