import java.util.Scanner;
public class CTA_3A_PROG
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[4][4];
        int s=0,rs=0,cs=0,i,j;
        System.out.println("Enter elements of 4x4 matrix:");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
            a[i][j]=sc.nextInt();
            s+=a[i][j];
            }
        }
        System.out.println("Elements in DDA format:");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            System.out.print(a[i][j]+" ");
            System.out.println();
        }
        System.out.println("Sum of all elements= "+s);
        for(i=0;i<4;i++)
        {rs=0;
            for(j=0;j<4;j++)
            rs+=a[i][j];
            System.out.println("Sum of row "+(i+1)+"= "+rs);
        }
        for(i=0;i<4;i++)
        {cs=0;
            for(j=0;j<4;j++)
            cs+=a[j][i];
            System.out.println("Sum of column "+(i+1)+"= "+cs);
        }
    }
}