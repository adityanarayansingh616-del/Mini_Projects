public class series_1
{
    double series(double x,int n)
    {
        double sum=0.0d,fact=1.0;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
            if(i%2==0)
            sum-=(x/fact);
            else
            sum+=(x/fact);
        }
        return sum;
    }
    double series(double x,double n)
    {
       double sum=0.0d;
       for(int i=2;i<=n;i+=3)
       sum+=x/i;
       return sum;
    }
}