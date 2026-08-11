import java.util.Scanner;
public class DDA_FIRST
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a[][]=new float[3][3];float sr1=0.0f,sr2=0.0f,sr3=0.0f;
        System.out.println("Enter real values of 3x3 matrix row-wise:");
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
            {
                a[i][j]=sc.nextFloat();
            }
        }
        System.out.println("Your Matrix:");
        for(int i=0;i<=2;i++)
        {
            float s=0.0f;
            for(int j=0;j<=2;j++)
            {
                s+=a[i][j];
                if(i==0)
                sr1=s;
                else if(i==1)
                sr2=s;
                else
                sr3=s;
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of 1st row- "+sr1);
        System.out.println("Sum of 2nd row- "+sr2);
        System.out.println("Sum of 3rd row- "+sr3);
    }
}