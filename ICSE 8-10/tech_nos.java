public class tech_nos
{
    public static void main(String args[])
    {
        System.out.println("Here are all the four-digit tech numbers:");
        for(int i=1000;i<=9999;i++)
        {
            if(Math.pow(i/100+i%100,2)==i)
            System.out.println(i);
        }
    }
}