import java.util.Scanner;
public class DDA_RDGSFAV
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
            a[i][j]=sc.nextInt();
        }
        for(i=0;i<4;i++)//i<2 in case of 2 by 2 array and then [1-i] will be applicable.
        rdgs+=a[i][3-i];//for 4 by 4 array, depends on order of array, plzz understand the question carefully and then write the prog step-by-step.
        System.out.println("Sum of Right Diagonal elements- "+rdgs);
    }
}