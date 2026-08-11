import java.util.Scanner;
public class ASCII_SPECIAL
{
    protected static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char a[]=new char[10];int max=0,min=0;
        System.out.println("Enter 10 characters:");
        for(int i=0;i<10;i++)
        a[i]=sc.next().charAt(0);
        for(int i=0;i<10;i++)
        {
            if(a[max]<a[i])
            max=i;
            else if(a[min]>a[i])
            min=i;
        }
        System.out.println("Character with highest ASCII value- "+a[max]);
        System.out.println("Character with lowest ASCII value- "+a[min]);
    }
}