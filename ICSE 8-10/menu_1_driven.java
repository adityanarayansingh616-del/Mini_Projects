import java.util.Scanner;
public class menu_1_driven
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch=0,n=0,sf=0,sd=0;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        System.out.println("Press 1 to get the sum of all the factors of "+n);
        System.out.println("Press 2 to check for Dudney number.");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1: for(int i=1;i<=n;i++)
                    {
                        if(n%i==0)
                        sf+=i;
                    }
                    System.out.println("Sum of factors- "+sf);
                    break;
            case 2: for(int i=n;i>0;i/=10)
                    sd+=(i%10);
                    if((sd*sd*sd)==n)
                    System.out.println(n+" is a Dudney number.");
                    else
                    System.out.println(n+" is not a Dudney number.");
                    break;
            default: System.out.println("Wrong input.");   
        }
    }
}