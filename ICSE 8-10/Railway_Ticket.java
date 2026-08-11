import java.util.Scanner;
public class Railway_Ticket
{
    String name,coach;long mob_no;int amt,total_amt;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        name=sc.nextLine();
        System.out.println("Enter coach:");
        coach=sc.next();
        System.out.println("Enter mobile number:");
        mob_no=sc.nextLong();
        System.out.println("Enter amount:");
        amt=sc.nextInt();
    }
    void update()
    {
        if(coach.equalsIgnoreCase("First_AC"))
        total_amt=amt+700;
        else if(coach.equalsIgnoreCase("Second_AC"))
        total_amt=amt+500;
        else if(coach.equalsIgnoreCase("Third_AC"))
        total_amt=amt+250;
        else
        total_amt=amt;
    }
    void display()
    {
        System.out.println("Name- "+name);
        System.out.println("Coach- "+coach);
        System.out.println("Total amount- RS."+total_amt);
        System.out.println("Mobile number- "+mob_no);
    }
    public static void main(String args[])
    {
        Railway_Ticket ob=new Railway_Ticket();
        ob.accept();
        ob.update();
        ob.display();
    }
}