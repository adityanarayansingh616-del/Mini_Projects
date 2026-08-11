import java.util.Scanner;
public class A_array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a[]=new String[10];
        System.out.println("Enter 10 words:");
        for(int i=0;i<10;i++)
        a[i]=sc.next();
        System.out.println("The names which start and end with letter 'A' or 'a' are:");
        for(int i=0;i<10;i++)
        {
            char fc=a[i].charAt(0);
            char lc=a[i].charAt(a[i].length()-1);
            if((fc=='A' || fc=='a') && (lc=='A' || lc=='a'))
            System.out.println(a[i]);
        }
    }
}