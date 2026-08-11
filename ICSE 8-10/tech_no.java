import java.util.Scanner;
public class tech_no
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=0,fp=0,sp=0,s=0,sq=0;
        System.out.println("Enter a four-digit number:");
        while(sq==0)
        {
        n=sc.nextInt();
        if(n/10000==0&&n/1000!=0&&n/100!=0&&n/10!=0)
        break;
        else
        System.out.println("Please enter a four-digit number to continue:");
        }
        fp=n/100;
        sp=n%100;
        s=fp+sp;
        sq=s*s;
        if(sq==n)
        System.out.println(n+" is a tech number.");
        else
        System.out.println(n+" is not a tech number.");
    }
}