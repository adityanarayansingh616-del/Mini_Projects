public class DDA_CS
{
    public static void main(String args[])
    {
        int a[][]={{1,2,3},
                   {4,5,6},
                   {7,8,9}};
        int c=0;
        for(int i=0;i<3;i++)
        { c=0;
          for(int j=0;j<3;j++)
          c+=a[j][i];
          System.out.println("Sum of column "+(i+1)+"= "+c);
        }
    }
}