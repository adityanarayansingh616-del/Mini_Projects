//FLAG DISPLAY. MRP.10
public class flag
{
    public static void main(String args[])
    {
    System.out.println("\t\tFLAG");
      for(int c=1;c<=3;c++)
      {
      c*=(c*2);
      for(int i=1;i<=10;i++)
       {
           for(int j=1;j<=i;j++)
           {
               System.out.print("\b|-");
           }
           System.out.println("\b*");
        }
    }
    for(int a=1;a<=20;a++)
    System.out.println("\b|");
}
}