import java.util.Scanner;
public class DDA_SPN
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[][]a=new int[4][4];
        int s=0,n=0,f=0;
        System.out.println("Enter elements of 4x4 matrix one by one:");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
            a[i][j]=sc.nextInt();
            n=a[i][j];
            for(int k=1;k<=n;k++)
            {
                if(n%k==0)
                f++;
            }
            if(f==2)
            s+=n;
            f=0;
            }
        }
        System.out.println("Sum of prime number elements- "+s);
    }
}