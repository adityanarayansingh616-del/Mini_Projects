import java.util.Scanner;
public class bubble_sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char a[]=new char[10];
        System.out.println("Enter 10 characters:");
        for(int i=0;i<a.length;i++)
        a[i]=sc.next().charAt(0);
        System.out.println("Original array:");
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
        int i,j;
        for(i=0;i<a.length-1;i++)
        {
            for(j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    char t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("\nSorted array:");
        for(int k=0;k<a.length;k++)
        System.out.print(a[k]+" ");
    }
}