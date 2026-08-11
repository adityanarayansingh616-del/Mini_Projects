public class DDA_SSE
{
    public static void main(String args[])
    {
        int [][]a={{2,222,468,54},
                   {32,42,68,76},
                   {86,2864,69,78},
                   {45,23,14,88}};int s=0,n=0,ld=0,fd=0;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                n=a[i][j];
                ld=n%10;
                while(n>0)
                {
                    fd=n%10;
                    n/=10;
                }
                if(fd%2==0 && ld%2==0)
                s+=a[i][j];
            }
        }
        System.out.println("Sum of elements which starts and ends with an even number- "+s);
    }
}