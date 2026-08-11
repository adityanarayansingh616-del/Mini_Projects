public class DDA_LDGS2M
{
    public static void main(String args[])
    {
        int a[][]={{1,2,3,4},
                   {5,6,7,8},
                   {9,10,11,12},
                   {13,14,15,16}};//STORING
        int ldgs=0,i,j;
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                if(i==j)
                ldgs+=a[i][j];
            }
        }
        System.out.println("Left diagonal elements sum- "+ldgs);
    }
}