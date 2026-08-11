import java.util.Scanner;
public class MOBIKE
{
    int Mob_no,Dist,Amount;String Cust_name;
    void Input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mobike number:");
        Mob_no=sc.nextInt();
        System.out.println("Enter customer name:");
        Cust_name=sc.next();
        System.out.println("Enter distance travelled(in Kms):");
        Dist=sc.nextInt();
    }
    void Clac()
    {
        Amount+=250;
        if(Dist<=100)
        Amount=Dist*20;
        else if(Dist<=300)
        Amount=100*20+(Dist-100)*50;
        else if(Dist<=650)
        Amount=100*20+200*50+(Dist-300)*60;
        else
        Amount=100*20+200*50+350*60+(Dist-650)*65;
    }
    void Display()
    {
        System.out.println("Bike No\tCustomer\tKm travelled\tAmount");
        System.out.println(Mob_no+"\t"+Cust_name+"\t"+Dist+"\t"+Amount);
    }
    public static void main(String args[])
    {
        MOBIKE obj=new MOBIKE();
        obj.Input();
        obj.Clac();
        obj.Display();
    }
}