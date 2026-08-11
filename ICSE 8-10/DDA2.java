import java.util.Scanner;
public class DDA2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[4][4];
        System.out.println("Enter the elements of 4x4 array:");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            arr[i][j]=sc.nextInt();
        }
        int ldgs=0,rdgs=0;
        for(int i=0;i<4;i++)
        {
            ldgs+=arr[i][i];
            rdgs+=arr[i][3-i];
        }
        if(ldgs==rdgs)
        System.out.println("The array is a Diagonal array.");
        else
        System.out.println("The array is not a Diagonal array.");
    }
}