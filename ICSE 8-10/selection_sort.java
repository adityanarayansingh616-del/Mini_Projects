import java.util.Scanner;
public class selection_sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter 10 integer values:");
        for(int i=0;i<a.length;i++)
        a[i]=sc.nextInt();
        int i,j;
        for(i=0;i<a.length-1;i++)
        {
            int min=i;
            for(j=i+1;j<a.length;j++)
            {
                if(a[min]>a[j])
                min=j;
            }
            int t=a[i];
            a[i]=a[min];
            a[min]=t;
        }
        System.out.println("Sorted array:");
        for(int k=0;k<a.length;k++)
        System.out.print(a[k]+" ");
    }
}