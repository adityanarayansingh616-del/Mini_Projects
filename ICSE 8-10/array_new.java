public class array_new
{
    public static void main(String args[])
    {
        String []w={"APPLE","HAPPY","AUSTRIA","ENGLAND"};
        for(int i=0;i<w.length;i++)
        {
            String wd=w[i];
            char fc=wd.charAt(0);
            char lc=wd.charAt(wd.length()-1);
            if(fc=='A'||fc=='E'||fc=='I'||fc=='O'||fc=='U'&&lc=='A'||lc=='E'||lc=='I'||lc=='O'||lc=='U')
            System.out.println(wd);
        }
    }
}