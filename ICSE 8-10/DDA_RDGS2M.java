import java.util.Scanner;
public class DDA_RDGS2M
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[4][4];//INPUT
        System.out.println("Enter elements of 4x4 array one by one:");
        int i,j,rdgs=0;
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
            a[i][j]=sc.nextInt();
            if(i+j==3)
            rdgs+=a[i][j];
            }
        }
       System.out.println("Sum of Right Diagonal elements- "+rdgs);
    }
}