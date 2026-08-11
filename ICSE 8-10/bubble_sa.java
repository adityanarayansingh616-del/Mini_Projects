import java.util.Scanner;
public class bubble_sa
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a[]=new String[5];
        System.out.println("Enter 5 names:");
        for(int i=0;i<a.length;i++)
        a[i]=sc.next();
        System.out.println("Original array:");
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
        int i,j;
        for(i=0;i<a.length-1;i++)
        {
            for(j=0;j<a.length-1-i;j++)
            {
                if(a[j].compareTo(a[j+1])>0)
                {
                    String T=a[j];
                    a[j]=a[j+1];
                    a[j+1]=T;
                }
            }
        }
        System.out.println("\nSorted array:");
        for(int k=0;k<a.length;k++)
        System.out.print(a[k]+" ");
    }
}