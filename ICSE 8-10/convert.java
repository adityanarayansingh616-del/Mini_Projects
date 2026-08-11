import java.util.Scanner;
public class convert
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String nst="";
        System.out.println("Enter a string:");
        String st=sc.nextLine();
        st=st.toUpperCase();
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(Character.isLetter(ch))
            {
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            nst+=++ch;
            else
            nst+=--ch;
            }
            else
            nst+=ch;
    }
    System.out.println("New String- "+nst);
}
}