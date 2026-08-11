import java.util.Scanner;
public class ICSE_2025
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[100],c1=0,c2=0,c3=0,c4=0;
        System.out.println("Enter the Computer Applications marks of 100 Students:");
        for(int i=0;i<100;i++)
        {
            System.out.println("Enter the marks of student "+(i+1)+"-");
            marks[i]=sc.nextInt();
            if(marks[i]>90 && marks[i]<=100)
            c1++;
            else if(marks[i]>80 && marks[i]<=90)
            c2++;
            else if(marks[i]>60 && marks[i]<=80)
            c3++;
            else
            c4++;
        }
        System.out.println("Range\t\tNo.of Students");
        System.out.println("Above 90\t\t"+c1+"\n80-90\t\t"+c2+"\n60-80\t\t"+c3+"\nBelow 60\t\t"+c4);
        
    }
}