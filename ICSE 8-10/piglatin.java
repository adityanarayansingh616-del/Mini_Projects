import java.util.*;
public class piglatin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=0;
        System.out.println("Enter a word:");
        String w=sc.next();
        for(int i=0;i<w.length();i++)
        {
            char ch=w.charAt(i);
            if("AEIOUaeiou".indexOf(ch)!=-1)
            {
                x=i;
                break;
            }
        }
        System.out.println(w.substring(x)+w.substring(0,x)+"ay");
    }
}