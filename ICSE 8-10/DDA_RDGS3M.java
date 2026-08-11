public class DDA_RDGS3M
{
    public static void main(String args[])
    {
        int a[][]={{1,2,3},
                   {5,6,7},
                   {9,10,11}};
        int rdgs=0;
        for(int i=0,j=2;i<3;i++,j--)
        rdgs+=a[i][j];
        System.out.println("Right Diagonal elements sum- "+rdgs);
    }
}