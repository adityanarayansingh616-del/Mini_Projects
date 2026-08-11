public class Myclass
{
    void display(String str,char chr)
    {
        if(chr=='e')
        {
          for(int i=0;i<str.length();i++)
          {
              char ch=str.charAt(i);
              if((i+1)%2==0)
              System.out.println(ch);
          }
        }
        else
        {
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if((i+1)%2!=0)
                System.out.println(ch);
            }
        }
    }
    int display(String str,int p)
    {
       if(p==1)
       return str.indexOf('a')+1;
       else
       return str.lastIndexOf('a')+1;
    }
    void display(int x,int y)
    {
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=y;j++)
            System.out.print("@");
            System.out.println();
        }
    }
}