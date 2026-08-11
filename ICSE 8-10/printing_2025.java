public class printing_2025
{
    void print()
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(j%2==0)
                System.out.print("%");
                else
                System.out.print("@");
            }
            System.out.println();
        }
    }
    double print(double a,double b)
    {
        double s=0.0;
        for(double i=a;i<=b;i+=0.5)
        s+=i;
        return s;
    }
    int print(char ch1,char ch2)
    {
        if(ch1>ch2)
        return(int)ch1;
        else
        return(int)ch2;
    }
}