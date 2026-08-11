import java.util.Scanner;
public class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int d=0,alp=0,spc=0,ws=0;
        System.out.println("Enter a string:");
        String S=sc.nextLine();
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            if(Character.isDigit(ch))
            d++;
            else if(Character.isLetter(ch))
            alp++;
            else if(Character.isWhitespace(ch))
            ws++;
            else
            spc++;
        }
        System.out.println("Number of digits- "+d);
        System.out.println("Number of alphabets- "+alp);
        System.out.println("Number of special characters- "+spc);
    }
}