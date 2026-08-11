import java.util.*;
public class BHDB
{
    double pa,amount,EMI;int r,n;
    BHDB()
    {
        pa=0.0;
        amount=0.0;
        EMI=0.0;
        r=0;
        n=0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter purchase amount:");
        pa=sc.nextDouble();
        System.out.println("Enter number of years of the tenure:");
        n=sc.nextInt();
    }
    void calculate()
    {
        if(pa<20000.0)
        r=12;
        else
        r=15;
        amount=pa*Math.pow(1+(r/100.0),n);
        EMI=(double)Math.round(amount/(n*12));
    }
    void print()
    {
        System.out.println("Purchase amount: RS."+pa+"/-");
        System.out.println("Rate of interest: "+r+"%");
        System.out.println("Amount with interest: RS."+amount+"/-");
        System.out.println("EMI: RS."+EMI+"/-");
    }
    public static void main(String args[])
    {
        BHDB ob=new BHDB();
        ob.accept();
        ob.calculate();
        ob.print();
    }
}
