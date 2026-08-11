import java.util.Scanner;
public class DDA
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        System.out.println("Enter elements of the 3x3 array:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            arr[i][j]=sc.nextInt();
        }
        int es=0,os=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(arr[i][j]%2==0)
                es+=arr[i][j];
                else
                os+=arr[i][j];
            }
        }
        if(es==os)
        System.out.println("The array is special.");
        else
        System.out.println("The array is not special.");
    }
}