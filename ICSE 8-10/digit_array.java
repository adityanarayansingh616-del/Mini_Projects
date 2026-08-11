import java.util.Scanner;
public class digit_array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ons=0,twos=0;
        int a[]=new int[10];
        System.out.println("Enter 10 integer values:");
        for(int i=0;i<a.length;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>=0 && a[i]<10)
            ons+=a[i];
            else if(a[i]>9 && a[i]<100)
            twos+=a[i];
        }
        System.out.println("Sum of one digit numbers: "+ons);
        System.out.println("Sum of two digit numbers: "+twos);
    }
}