import java.util.Scanner;
public class selection_na
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter 10 integers:");
        for(int i=0;i<a.length;i++)
        a[i]=sc.nextInt();
        System.out.println("Original array:");
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
        int i,j,min;
        for(i=0;i<a.length-1;i++)
        {
            min=i;
            for(j=i+1;j<a.length;j++)
            {
                if(a[min]>a[j])
                min=j;
            }
            int T=a[i];
            a[i]=a[min];
            a[min]=T;
        }
        System.out.println("\nSorted array:");
        for(int k=0;k<a.length;k++)
        System.out.print(a[k]+" ");
    }
}