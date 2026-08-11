import java.util.Scanner;
public class Special_String_convertreferto
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String nst="";//null
        System.out.println("Enter a string:");
        String st=sc.nextLine();
        st=st.toUpperCase();
        int i;
        for(i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(Character.isLetter(ch))
            {
                if("AEIOU".indexOf(ch)!=-1)
                System.out.print(++ch);//nst=nst+(char)(ch+1);
                else
                System.out.print(--ch);//nst+=(char)(ch-1);
            }
            else
            System.out.print(ch);//nst+=ch;
        }
        //System.out.println(nst);
    }
}