//This is a program for shop calculation.>><<
import java.util.Scanner;
public class shopcal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double pa=0.0d,d=0.0d,dp=0.0d,dpx=0.0d,dpxi=0.0d;String name;
        System.out.println("\t_Aditya Shudh Chocolate Bhandara PVT.LTD_");
        System.out.println("\tSpecial Offer(%)");
        System.out.println("1.5% Discount on shopping bill between RS.1 TO RS.3000");
        System.out.println("2.10% Discount on shopping bill between RS.3000 to RS.4999.");
        System.out.println("3.15% Discount on shopping bill of RS.5000 and above.");
        System.out.println("_");
        System.out.println("Enter Customer name:");
        name=sc.nextLine();
        while(d==0)
        {
        System.out.println("Enter purchase amount:");
        pa=sc.nextDouble();
        if(pa<1)
        {
        System.out.println("Purchase amount cannot be RS.0 or less than 0.Please try again.");
        System.out.println();
        }
        else
        break;
        }
        System.out.println("_");
        System.out.println("\tYour bill");
        if(pa<=3000)
        {
        d=5*(pa/100);
        dp=pa-d;
        dpx=(18*(dp/100));
        dpxi=dp+dpx;
        }
        else
        if(pa<=4999)
        {
        d=10*(pa/100);
        dp=pa-d;
        dpx=18*(dp/100);
        dpxi=dp+dpx;
        }
        else
        {
        d=15*(pa/100);
        dp=pa-d;
        dpx=18*(dp/100);
        dpxi=dp+dpx;
        }
        System.out.println("Total Purchase amount:"+pa);
        System.out.println("Total Discount:"+d);
        System.out.println("Total before tax:"+dp);
        System.out.println("Tax 18%");
        System.out.println("Total tax:"+dpx);
        System.out.println("Total after tax:"+dpxi);
        System.out.println("Grand Total:"+dpxi);
        System.out.println("\nThank you for shopping with us.\n*Aditya Shudh Chocolate Bhandara PVT.LTD,Ranchi*.");
        System.out.println("_X_");
        }
    }
