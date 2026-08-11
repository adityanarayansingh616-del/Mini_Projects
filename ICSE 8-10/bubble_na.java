import java.util.Scanner;
public class bubble_na
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
        int i,j;
        for(i=0;i<a.length-1;i++)
        {
            for(j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int T=a[j];
                    a[j]=a[j+1];
                    a[j+1]=T;
                }
            }
        }
        System.out.println("\nSorted array:");
        for(i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
    }
}