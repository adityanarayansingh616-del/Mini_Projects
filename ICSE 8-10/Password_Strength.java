import java.util.Scanner;
public class Password_Strength
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String pass="";int l=0,uc=0,lc=0,d=0,ws=0,spc=0;
        System.out.println("Enter a password to check its strength:");
        pass=sc.nextLine();
        l=pass.length();
        for(int i=0;i<l;i++)
        {
            char ch=pass.charAt(i);
            if(Character.isLetter(ch))
            {
                if(Character.isUpperCase(ch))
                uc++;
                if(Character.isLowerCase(ch))
                lc++;
            }
            else if(Character.isDigit(ch))
            d++;
            else if(Character.isWhitespace(ch))
            ws++;
            else
            spc++;
        }
        if(l>=12 && uc>=4 && lc>=4 && d>=2 && spc>=2)
        System.out.println("The password is strong.");
        else
        System.out.println("The password is not strong.");
    }
}