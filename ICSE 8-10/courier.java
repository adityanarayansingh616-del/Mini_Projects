import java.util.Scanner;
public class courier
{
    String name,address;int weight,bill;char type;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer name:");
        name=sc.next();
        System.out.println("Enter weight of the parcel(in kg):");
        weight=sc.nextInt();
        System.out.println("Enter recipient address:");
        address=sc.next();
        System.out.println("Enter type of courier('D'-Domestic,'I'-International):");
        type=sc.next().charAt(0);
    }
    void calculate()
    {
        if(weight<=5)
        bill=800*weight;
        else if(weight<=10)
        bill=800*5+700*(weight-5);
        else
        bill=800*5+700*5+500*(weight-10);
        if(type=='I')
        bill+=1500;
    }
    void print()
    {
        System.out.println("Customer name- "+name);
        System.out.println("Parcel weight- "+weight+" kg");
        System.out.println("Recipient address- "+address);
        System.out.println("Type of courier- "+type);
        System.out.println("Bill amount- RS."+bill+"/-");
    }
    public static void main(String args[])
    {
        courier obj=new courier();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}