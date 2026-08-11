import java.util.Scanner;
public class CTA_2A_PROG
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int X[]={2,4,6,8,10};//Sorted Array
        System.out.println("Enter an integer:");
        int num=sc.nextInt();
        System.out.println("Search value- "+num);
        int L=0,U=X.length-1,mid=0;
        while(L<=U)
        {
            mid=(L+U)/2;
            if(X[mid]<num)
            L=mid+1;
            else if(X[mid]>num)
            U=mid-1;
            else
            {
                System.out.println("Element found at position- "+(mid+1));
                System.exit(0);
            }
        }
        System.out.println("Not found in the list and search unsuccessful.");
    }
}