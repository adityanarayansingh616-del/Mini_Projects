import java.util.Scanner;
public class Student
{
    String name,stream;int age,mks;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of the student:");
        name=sc.nextLine();
        System.out.println("Enter age:");
        age=sc.nextInt();
        System.out.println("Enter marks obtained:");
        mks=sc.nextInt();
    }
    void allocation()
    {
        if(mks>=300)
        stream="Science and Computer";
        else if(mks>=200)
        stream="Commerce and Computer";
        else if(mks>=75)
        stream="Arts and Animation";
        else
        stream="Try Again";
    }
    void print()
    {
        System.out.println("Student name- "+name);
        System.out.println("Age- "+age);
        System.out.println("Marks obtained- "+mks);
        System.out.println("Stream allocated- "+stream);
    }
    public static void main(String args[])
    {
        Student obj=new Student();
        obj.accept();
        obj.allocation();
        obj.print();
    }
}