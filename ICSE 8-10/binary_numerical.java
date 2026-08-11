import java.util.Scanner;
public class binary_numerical
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,4,5,6,7,8,99,100,101};//Sorted array
        System.out.println("Enter a number to be searched:");
        int n=sc.nextInt();
        int L=0,U=a.length-1,mid=0;
        while(L<=U)
        {
            mid=(L+U)/2;
            if(n>a[mid])
            L=mid+1;
            else if(n<a[mid])
            U=mid-1;
            else
            {
                System.out.println("Search successful. Element found at Index- "+mid+" and Position- "+(mid+1));
                System.exit(0);
            }
        }
        System.out.println("Search unsuccessful. Element not found.");
    }
}