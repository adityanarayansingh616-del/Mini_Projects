public class series2
{
    void series(int x,int n)
    {
        int s=0;
        for(int i=1;i<=n;i++)
        s=s+(int)Math.pow(x,i);
        System.out.println("Sum- "+s);
    }
    void series(int p)
    {
        for(int i=1;i<=p;i++)
        System.out.print(i*i*i-1+",");
    }
    void series()
    {
        double s=0.0;
        for(int i=2;i<=10;i++)
        s=s+1.0/i;
        System.out.println("Sum- "+s);
    }
}