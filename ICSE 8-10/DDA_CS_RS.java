import java.util.Scanner;
public class DDA_CS_RS
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];int r=0,c=0;
        System.out.println("Enter elements of 3 by 3 array one by one:");
        int i,j;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            a[i][j]=sc.nextInt();
        }
        for(i=0;i<3;i++)
        { r=0;c=0;
          for(j=0;j<3;j++)
          {
          r+=a[i][j];
          c=c+a[j][i];
          }
          System.out.println("Sum of row "+(i+1)+"= "+r);
          System.out.println("Sum of column "+(i+1)+"= "+c);
        }
    }
}