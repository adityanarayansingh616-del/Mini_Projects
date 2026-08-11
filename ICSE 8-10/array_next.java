public class array_next
{
    public static void main(String args[])
    {
        String a[]={"INDIA","MOM","DAD","LOL","YOYO"},revw="";
        for(int i=0;i<a.length;i++)
        {
            String w=a[i];
            for(int j=0;j<w.length();j++)
            {
                char ch=w.charAt(j);
                revw=ch+revw;
            }
            if(w.equals(revw))
            System.out.println(w);
        }
    }
}