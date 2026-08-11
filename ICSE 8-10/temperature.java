//This is a program for Temperature Conversion.(>><<)*?;MRP.20
import java.util.Scanner;
public class temperature
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double c=0.0d,f=0.0d,k=0.0d;int ch=0;
        System.out.println("\tTemperaure Conversion");
        do
        {
        System.out.println("1.C to F\n2.F to C\n3.C to K\n4.K to C\n5.F to K\n6.K to F");
        System.out.println("Enter your choice(1-6):");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter Celsius value(C):");
                c=sc.nextDouble();
                f=((9.0/5.0*c)+32.0);
                System.out.println("Fahrenheit value="+f+"F");
                break;
            case 2:
                System.out.println("Enter Fahrenheit value(F):");
                f=sc.nextDouble();
                c=(5.0/9.0)*(f-32.0);
                System.out.println("Celsius value="+c+"C");
                break;
            case 3:
                System.out.println("Enter Celsius value(C):");
                c=sc.nextDouble();
                k=(c+273.15);
                System.out.println("Kelvin value="+k+"K");
                break;
            case 4:
                System.out.println("Enter Kelvin value(K):");
                k=sc.nextDouble();
                c=(k-273.15);
                System.out.println("Celsius value="+c+"C");
                break;
            case 5:
                System.out.println("Enter Fahrenheit value(F):");
                f=sc.nextDouble();
                k=(f-32.0)*(5.0/9.0)+273.15;
                System.out.println("Kelvin value="+k+"K");
                break;
            case 6:
                System.out.println("Enter Kelvin value(K):");
                k=sc.nextDouble();
                f=1.8*(k-273.15)+32.0;
                System.out.println("Fahrenheit value="+f+"F");
                break;
            default:System.out.println("Invalid choice.Enter choice between 1 to 6 to continue.\n");
        }
    }while(ch>6 || ch<1);
}
}