//This is a program for result calculation.<<>>;MRP.50
import java.util.Scanner;
public class exam_result
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int e1=0,e2=0,h=0,s=0,m=0,p=0,c=0,b=0,hs=0,g=0,cta=0,gk=0,tmo=0;String name;double per=0.0d;
        System.out.println("\tST.THOMAS SCHOOL,DHURWA,RANCHI");
        System.out.println("\t------Achievement Record------");
        
        System.out.println("Enter Student name:");
        name=sc.nextLine();
        System.out.println("");
        System.out.println("\tStudent Performance");
        
        while(per==0)
        {
        System.out.println("Enter English I marks:");
        e1=sc.nextInt();
        if(e1>100 || e1<0)
        {
            System.out.println("Marks cannot be greater than 100.Please re-enter.");
            System.out.println();
        }
        else
        break;
        }
        while(per==0)
        {
        System.out.println("Enter English II marks:");
        e2=sc.nextInt();
        if(e2>100 || e2<0)
        {
            System.out.println("Marks cannot be greater than 100.Please re-enter.");
            System.out.println();
        }
        else
        break;
        }
        while(per==0)
        {
        System.out.println("Enter Hindi marks:");
        h=sc.nextInt();
        if(h>100 || h<0)
        {
            System.out.println("Marks cannot be greater than 100.Please re-enter.");
            System.out.println();
        }
        else
        break;
        }
        while(per==0)
        {
        System.out.println("Enter Maths marks:");
        m=sc.nextInt();
        if(m>100 || m<0)
        {
            System.out.println("Marks cannot be greater than 100.Please re-enter.");
            System.out.println();
        }
        else
        break;
        }
        while(per==0)
        {
        System.out.println("Enter Physics marks:");
        p=sc.nextInt();
        if(p>100 || p<0)
        {
            System.out.println("Marks cannot be greater than 100.Please re-enter.");
            System.out.println();
        }
        else
        break;
        }
        while(per==0)
        {
        System.out.println("Enter Chemistry marks:");
        c=sc.nextInt();
        if(c>100 || c<0)
        {
            System.out.println("Marks cannot be greater than 100.Please re-enter.");
            System.out.println();
        }
        else
        break;
        }
        while(per==0)
        {
        System.out.println("Enter Biology marks:");
        b=sc.nextInt();
        if(b>100 || b<0)
        {
            System.out.println("Marks cannot be greater than 100.Please re-enter.");
            System.out.println();
        }
        else
        break;
        }
        while(per==0)
        {
        System.out.println("Enter History/Civics marks:");
        hs=sc.nextInt();
        if(hs>100 || hs<0)
        {
            System.out.println("Marks cannot be greater than 100.Please re-enter.");
            System.out.println();
        }
        else
        break;
        }
        while(per==0)
        {
        System.out.println("Enter Geography marks:");
        g=sc.nextInt();
        if(g>100 || g<0)
        {
            System.out.println("Marks cannot be greater than 100.Please re-enter.");
            System.out.println();
        }
        else
        break;
        }
        while(per==0)
        {
        System.out.println("Enter Computer marks:");
        cta=sc.nextInt();
        if(cta>100 || cta<0)
        {
            System.out.println("Marks cannot be greater than 100.Please re-enter.");
            System.out.println();
        }
        else
        break;
        }
        tmo=(e1+e2+h+m+p+c+b+hs+g+cta);
        per=(double)(tmo*100)/1000;
        System.out.println("_");
        System.out.println("\tResult");
        System.out.println("Total marks=1000");
        System.out.println("Total marks obtained="+tmo);
        System.out.println("Percentage="+per+"%");
        System.out.println("Position in the class- 5th");
        System.out.println("_X_");
    
}}