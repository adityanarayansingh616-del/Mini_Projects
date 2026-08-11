import java.util.Scanner;
public class DDA_RS
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];int r=0;
        System.out.println("Enter elements of 3 by 3 array one by one:");
        int i,j;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            a[i][j]=sc.nextInt();
        }
        for(i=0;i<3;i++)
        { r=0;
          for(j=0;j<3;j++)
          r+=a[i][j];
          System.out.println("Sum of row "+(i+1)+"= "+r);
        }
    }
}