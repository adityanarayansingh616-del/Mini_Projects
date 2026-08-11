import java.util.Scanner;
public class linear_search
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a[]=new double[20];
        System.out.println("Enter 20 real values:");
        for(int i=0;i<a.length;i++)
        a[i]=sc.nextDouble();
        System.out.println("Enter a real value to be searched:");
        double n=sc.nextDouble();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n)
            {
            System.out.println("Found.\nPosition- "+(i+1));
            System.exit(0);
            }
        }
        System.out.println("Not found.");
    }
}