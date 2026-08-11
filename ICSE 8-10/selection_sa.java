import java.util.Scanner;
public class selection_sa
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
        int i,j,min;
        for(i=0;i<a.length-1;i++)
        {
            min=i;
            for(j=i+1;j<a.length;j++)
            {
                if(a[min].compareTo(a[j])>0)
                min=j;
            }
            String T=a[i];
            a[i]=a[min];
            a[min]=T;
        }
        System.out.println("\nSorted array:");
        for(int k=0;k<a.length;k++)
        System.out.print(a[k]+" ");
    }
}