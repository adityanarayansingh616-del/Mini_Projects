public class Stock
{
    String Pname;int qty;double price,totalCost,dis,netAmount;
    Stock(String n,int q,double p)
    {
        Pname=n;
        qty=q;
        price=p;
    }
    void calculate()
    {
        totalCost=price*qty;
        if(totalCost>=10000.0)
        dis=0.15*totalCost;
        else
        dis=0.07*totalCost;
        netAmount=totalCost-dis;
    }
    void display()
    {
        System.out.println("Product name- "+Pname);
        System.out.println("Total cost- RS."+totalCost);
        System.out.println("Discount- RS."+dis);
        System.out.println("Net amount- RS."+netAmount);
    }
    public static void main(String args[])
    {
        Stock ob=new Stock("Kitkat",10,3000.0);
        ob.calculate();
        ob.display();
    }
}