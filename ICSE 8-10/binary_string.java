import java.util.Scanner;
public class binary_string
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a[]={"ADITYA","BRO","CATTY","DOGGY","ZEBRA"};//Sorted array
        System.out.println("Enter a name to be searched:");
        String n=sc.next().toUpperCase();
        int L=0,U=a.length-1,mid=0;
        while(L<=U)
        {
            mid=(L+U)/2;
            if(n.compareTo(a[mid])>0)
            L=mid+1;
            else if(n.compareTo(a[mid])<0)
            U=mid-1;
            else
            {
                System.out.println("Search successful. Name found at Index- "+mid+" and Position- "+(mid+1));
                System.exit(0);
            }
        }
        System.out.println("Search unsuccessful. Name not found.");
    }
}