import java.util.Scanner;
public class longest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String lw="",w="";int max=0;
        System.out.println("Enter a sentence:");
        String str=sc.nextLine()+" ";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch!=' ')
            w+=ch;
            else
            {
                if(w.length()>max)
                {
                  max=w.length();
                  lw=w;
                }
                w="";
            }
        }
        System.out.println("Longest word- "+lw+" "+max);
    }
}