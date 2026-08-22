// Calculates the sum of a nested triangular series where inner sums from 1 to i are accumulated up to i = 20.
public class series_2
{
    public static void main(String args[])
    {
        int s=0,ms=0;
        for(int i=1;i<=20;i++)
        {   s=0;
            for(int j=1;j<=i;j++)
            s+=j;
            ms+=s;
        }
        System.out.println("Sum- "+ms);
    }
}