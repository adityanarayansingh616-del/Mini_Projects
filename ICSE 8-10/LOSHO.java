import java.util.Scanner;
public class LOSHO
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3],r=0,c=0,s=0;
        System.out.println("Enter values of 3x3 array:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            a[i][j]=sc.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            r=0;c=0;
            for(int j=0;j<3;j++)
            {
            r+=a[i][j];
            c+=a[j][i];
        }
        s+=r+c;
    }
    if(s==90)
    System.out.println("Losho grid.");
    else
    System.out.println("Not a Losho grid.");
}
}