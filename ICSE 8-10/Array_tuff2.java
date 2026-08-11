import java.util.Scanner;
public class Array_tuff2
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n=0;
       System.out.println("Enter number of students:");
       n=sc.nextInt();
       System.out.println("Enter the names and total marks of "+n+" students one by one.");
       String name[]=new String[n];
       int totalmarks[]=new int[n],s=0;
       double dev[]=new double[n],avg=0.0;
       for(int i=0;i<n;i++)
       {
          System.out.println("Enter student name:");
          name[i]=sc.next();
          System.out.println("Enter total marks:");
          totalmarks[i]=sc.nextInt();
          s+=totalmarks[i];
       }
       avg=s/(double)n;
       System.out.println("Average- "+avg);
       for(int i=0;i<n;i++)
       {
           System.out.println("Deviation for "+name[i]+":");
           System.out.println(totalmarks[i]-avg);
       }
    }
}