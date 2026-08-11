import java.util.*;
public class ICSE_ISC
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String sin="";//null
        System.out.println("Enter your index number:");
        sin=sc.next();
        if(sin.charAt(0)=='1')
        System.out.println("Class: 10");
        if(sin.charAt(0)=='2')
        System.out.println("Class: 12");
        System.out.println("Year: ".concat(sin.substring(1,3)));
        System.out.println("Centre number: ".concat(sin.substring(3,7)));
        System.out.println("Index number: ".concat(sin.substring(8)));
    }
}