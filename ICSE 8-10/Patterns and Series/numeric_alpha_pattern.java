// Shows a numeric or alpha-numeric triangle pattern from a menu choice.
import java.util.*;
public class numeric_alpha_pattern
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Press 1 to get a numeric pattern.");
    System.out.println("Press 2 to get an alpha-numeric pattern.");
    int ch=sc.nextInt();
    switch(ch)
    {
        case 1: for(int i=4;i>=1;i--)
                {
                    for(int j=1;j<=i;j++)
                    System.out.print(j);
                    System.out.println();
                }
                break;
        case 2: char k='A';
                for(int i=4;i>=1;i--)
                {
                    for(int j=i;j>=1;j--)
                    System.out.print(j);
                    System.out.println(k++);
                }
                break;
        default: System.out.println("Wrong input.");
    }
    }
}
