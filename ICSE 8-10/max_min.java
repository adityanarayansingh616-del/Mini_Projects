import java.util.Scanner;
public class max_min
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter 10 numbers:");
        for(int i=0;i<a.length;i++)
        a[i]=sc.nextInt();
        int min=a[0],max=a[0];
        for(int i=1;i<10/*or a.length*/;i++)
        {
            if(min>a[i])
            min=a[i];
            else if(max<a[i])
            max=a[i];
        }
        System.out.println("Maximum number- "+max);
        System.out.println("Minimum number- "+min);
    }
}