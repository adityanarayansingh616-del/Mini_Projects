import java.util.Scanner;
public class Eshop
{
    String name;double price;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter item name:");
        name=sc.nextLine();
        System.out.println("Enter item price:");
        price=sc.nextDouble();
    }
    void calculate()
    {
        if(price>=1000 && price<=25000)
        price=price-0.05*price;
        else if(price<=57000)
        price=price-0.075*price;
        else if(price<=100000)
        price=price-0.10*price;
        else
        price=price-0.15*price;
    }
    void display()
    {
        System.out.println("Item name- "+name);
        System.out.println("Net amount to be paid- RS."+price+"/-");
    }
    public static void main(String args[])
    {
        Eshop obj=new Eshop();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}