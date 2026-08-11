public class performing
{
    double perform(double r,double h)
    {
        double l=0.0,CSA=0.0;
        l=Math.sqrt(r*r+h*h);
        CSA=(22.0/7.0)*r*l;
        return CSA;
    }
    void perform(int r,int c)
    {
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            System.out.print(j+" ");
            System.out.println();
        }
    }
    void perform(int m,int n,char ch)
    {
        if(ch=='Q')
        System.out.println("Quotient- "+((double)m/n));
        else if(ch=='R')
        System.out.println("Remainder- "+((double)m%n));
    }
}