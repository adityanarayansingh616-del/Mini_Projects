public class overload
{
    void perform(int x[])
    {
        int l=x[0];
        for(int i=1;i<x.length;i++)
        {
            if(l<x[i])
            l=x[i];
        }
        System.out.println("Largest: "+l);
    }
    void perform(String s,char ch)
    {
        int x=s.length()-5;
        if(ch=='F')
        System.out.println(s.substring(0,x+1));
        else if(ch=='L')
        System.out.println(s.substring(x));
    }
    void perform(int n)
    {
        int ld=n%10,fd=0;
        for(int i=n;i>0;i/=10)
        fd=i%10;
        System.out.println("Product- "+fd*ld);
    }
}