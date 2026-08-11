public class displaying
{
    void display()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            System.out.print(j+" ");
            System.out.println();
        }
    }
    void display(int n)
    {
        int d=0;
        while(n!=0)
        {
            d=n%10;
            System.out.println(Math.sqrt(d));
            n/=10;
        }
    }
}