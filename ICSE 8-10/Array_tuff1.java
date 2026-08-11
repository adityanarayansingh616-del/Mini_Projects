import java.util.Scanner;
public class Array_tuff1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String pn[]=new String[15];
        double p[]=new double[15];double d[]=new double[15];double amt[]=new double[15],tamt=0.0;
        System.out.println("Enter 15 product names and their prices:");
        for(int i=0;i<15;i++)
        {
            System.out.println("Enter product name:");
            pn[i]=sc.next();
            System.out.println("Enter its price:");
            p[i]=sc.nextDouble();
            d[i]=0.08*p[i];
            amt[i]=p[i]-d[i];
            tamt+=amt[i];
        }
        System.out.println("S.No.\tProduct Name\tPrice\tDiscount\tAmount");
        for(int i=0;i<15;i++)
        System.out.println((i+1)+"\t"+pn[i]+"\t"+p[i]+"\t"+d[i]+"\t"+amt[i]);
        System.out.println("\t\t\t\tTotal Amount: "+tamt);
    }
}