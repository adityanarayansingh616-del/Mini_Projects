import java.util.*;
public class frequency
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        System.out.println("Enter a string:");
        String st=sc.nextLine().toUpperCase();
        for(char i='A';i<='Z';i++)
        {
            for(int j=0;j<st.length();j++)
            {
                char ch=st.charAt(j);
                if(ch==i)
                c++;
            }
            if(c!=0)
            {
            System.out.println("Frequency of "+i+": "+c);
            c=0;
            }
        }
    }
}