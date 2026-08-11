import java.util.Scanner;
public class MKG
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name:");
        String n=sc.nextLine();
        n=" "+n;
        int last=n.lastIndexOf(' ');
        for(int i=0;i<last;i++)
        {
            char ch=n.charAt(i);
            if(Character.isWhitespace(ch))//ch==' '
            System.out.print(n.charAt(i+1)+".");
        }
        System.out.print(n.substring(last+1));
    }
}