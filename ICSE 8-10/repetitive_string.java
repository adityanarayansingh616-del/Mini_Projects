import java.util.*;
public class repetitive_string
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string:");
        String st=in.nextLine().toLowerCase();
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(st.indexOf(ch)!=i)
            continue;
            else
            System.out.print(ch);
        }
    }
}