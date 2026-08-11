public class array_SDA
{
    public static void main(String args[])
    {
        int a[]={23432,121,212,123,890};
        for(int i=0;i<a.length;i++)
        {
            int n=a[i],d=0,revn=0;
            for(int j=n;j!=0;j/=10)
            {
                d=j%10;
                revn=revn*10+d;
            }
            if(revn==n)
            System.out.println(n);
        }
    }
}