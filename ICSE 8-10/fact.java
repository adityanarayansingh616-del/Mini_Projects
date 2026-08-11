import java.util.*;
public class fact
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=0,f=1,s=0,x=5;
        System.out.println("Enter n terms:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        { f=1;
            for(int j=1;j<=x;j++)
            f=f*j;
            s+=f;
            x+=3;
        }
        System.out.println("Sum of factorial series= "+s);
    }
}