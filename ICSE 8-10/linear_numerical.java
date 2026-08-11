import java.util.Scanner;
public class linear_numerical
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]={100,2,4,5,6,7,8,99,1,101};
        System.out.println("Enter a number to be searched:");
        int n=sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n)
            {
                System.out.println("Search successful. Element found at Index- "+i+" and Position- "+(i+1));
                System.exit(0);
            }
        }
        System.out.println("Search unsuccessful. Element not found.");
    }
}