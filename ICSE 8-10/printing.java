public class printing
{
    void print()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=4;j++)
            System.out.print(i+" ");
            System.out.println();
        }
    }
    void print(int n)
    {
        int es=0,os=0,d=0,tn=0;
        tn=n;
        while(tn!=0)
        {
            d=tn%10;
            if(d%2==0)
            es+=d;
            else
            os+=d;
            tn/=10;
        }
        if(es==os)
        System.out.println(n+" is a lead number.");
        else
        System.out.println(n+" is not a lead number.");
    }
}