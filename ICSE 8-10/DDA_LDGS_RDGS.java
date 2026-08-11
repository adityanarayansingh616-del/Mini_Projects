import java.util.Scanner;
public class DDA_LDGS_RDGS
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];int ldgs=0,rdgs=0;
        System.out.println("Enter elements of 3 by 3 array one by one:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
                if(i==j)
                ldgs+=a[i][j];
                if(i+j==2)//no else if cuz the element of 2nd row and 2nd column has the row number and column number such that both conditions are true for it. 
                rdgs+=a[i][j];
            }
        }
        System.out.println("Sum of Left Diagonal elements- "+ldgs);
        System.out.println("Sum of Right Diagonal elements- "+rdgs);
    }
}    