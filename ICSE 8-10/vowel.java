import java.util.Scanner;
public class vowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int v=0;
        System.out.println("Enter a string:");
        String st=sc.next();
        st=st.toUpperCase();
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if("AEIOU".indexOf(ch)!=-1)
            v++;
        }
        System.out.println(st);
        System.out.println("Number of vowels: "+v);
    }
}