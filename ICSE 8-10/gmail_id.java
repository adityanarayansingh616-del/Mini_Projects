import java.util.Scanner;
public class gmail_id
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a G-mail id to check for its validity:");
        String g=sc.next();
        if(g.endsWith("@gmail.com"))
        System.out.println("Valid G-mail id.");
        else
        System.out.println("Invalid G-mail id.");
    }
}