import java.util.*;
public class USHWA
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=0,s=0,s2=0,fd=0,ld=0;
        System.out.println("Enter a four-digit number:");
        n=sc.nextInt();
        if(n/10==0||n/100==0||n/1000==0||n/10000!=0)
        {
            System.out.println("Please enter a four-digit number to continue.");
            System.exit(0);
        }
        ld=n%10;
        for(int i=n;i>0;i/=10)
        {
            fd=i%10;
            s+=fd;
        }
        s2=2*(fd+ld);
        if(s==s2)
        System.out.println("Ushwa hai re baba!");
        else
        System.out.println("Nai hai re baba!");
    }
}