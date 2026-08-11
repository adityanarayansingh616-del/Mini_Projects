import java.util.*;
public class nested
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ter=0;
        System.out.println("Enter number of terms:");
        ter=sc.nextInt();
        for(int i=1;i<=ter;i+=4)
        {
            for(int j=i;j<=3+i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}