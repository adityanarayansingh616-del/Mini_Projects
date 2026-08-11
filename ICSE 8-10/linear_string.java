import java.util.Scanner;
public class linear_string
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a[]={"ADAM","ADITYA","NIKHEEL","SAKCHAMM","SURIYANSH"};
        System.out.println("Enter a name to be searched:");
        String n=sc.next().toUpperCase();
        for(int i=0;i<a.length;i++)
        {
            if(a[i].equals(n))
            {
                System.out.println("Search successful. Name found at Index- "+i+" and Position- "+(i+1));
                System.exit(0);
            }
        }
        System.out.println("Search unsuccessful. Name not found.");
    }
}