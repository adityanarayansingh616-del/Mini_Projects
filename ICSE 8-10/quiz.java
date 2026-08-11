//MRP.15
import java.util.Scanner;
public class quiz
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String ch;char ans;int m=0;double per=0.0d;
        while(m==0)
        {
        System.out.println("Do you want to play a quiz?(Type \'Yes\' or \'No\')");
        ch=sc.nextLine();
        if(ch.equalsIgnoreCase("no"))
        {
            System.out.println("You have chosen not to play.");
            System.exit(0);
        }
        else if(ch.equalsIgnoreCase("yes"))
        {
               System.out.println("You have chosen to play.");
               System.out.println("");
               System.out.println("Q.1 What is the capital of Meghalaya?");
               System.out.println("a.Aizawl\tb.Gangtok\nc.Shillong\td.Kohima");
               System.out.println("Choose your answer:");
               ans=sc.next().charAt(0);
               if(ans=='c')
               {
               System.out.println("Correct answer.");
               m++;
               }
               else
               if(ans=='C')
               {
               System.out.println("Correct answer.");
               m++;
               }
               else
               {
               System.out.println("Wrong answer.");
               System.out.println("Correct answer- c.Shillong");
               }
               System.out.println();
               System.out.println("Q.2 Who is the \'Father of Mathematics\'in the world?");
               System.out.println("a.Pythagoras\tb.Archimedes\nc.Aryabhatta\td.Heron");
               System.out.println("Choose your answer:");
               ans=sc.next().charAt(0);
               if(ans=='b')
               {
               System.out.println("Correct answer.");
               m++;
               }
               else
               if(ans=='B')
               {
               System.out.println("Correct answer.");
               m++;
               }
               else
               {
               System.out.println("Wrong answer.");
               System.out.println("Correct answer- b.Archimedes");
               }
               System.out.println();
               System.out.println("Q.3 Who designed C++ programming language?");
               System.out.println("a.Bjarne Stroustrup\tb.William Adam\nc.James Oron\td.Stephen Joy");
               System.out.println("Choose your answer:");
               ans=sc.next().charAt(0);
               if(ans=='a')
               {
               System.out.println("Correct answer.");
               m++;
               }
               else
               if(ans=='A')
               {
               System.out.println("Correct answer.");
               m++;
               }
               else
               {
               System.out.println("Wrong answer.");
               System.out.println("Correct answer- a.Bjarne Stroustrup");
               }
               System.out.println();
               System.out.println("Q.4 Which of these is liquid metal?");
               System.out.println("a.Bromine\tb.Mercury\nc.Berrylium\td.Fluorine");
               System.out.println("Choose your answer:");
               ans=sc.next().charAt(0);
               if(ans=='b')
               {
               System.out.println("Correct answer.");
               m++;
               }
               else
               if(ans=='B')
               {
               System.out.println("Correct answer.");
               m++;
               }
               else
               {
               System.out.println("Wrong answer.");
               System.out.println("Correct answer- b.Mercury");
               }
               System.out.println();
               System.out.println("Q.5 The first man to go in space?");
               System.out.println("a.Kirkpatrick Macmillan\tb.John Wills\nc.Quinton stud\td.Yuri Gagarin");
               System.out.println("Choose your answer:");
               ans=sc.next().charAt(0);
               if(ans=='d')
               {
               System.out.println("Correct answer.");
               m++;
               }
               else
               if(ans=='D')
               {
               System.out.println("Correct answer.");
               m++;
               }
               else
               {
               System.out.println("Wrong answer.");
               System.out.println("Correct answer- d.Yuri Gagarin");
               }
               System.out.println();
               System.out.println("Q.6 Which of these is not a keyword in Java programming language?");
               System.out.println("a.small\tb.goto\nc.this\td.while");
               System.out.println("Choose your answer:");
               ans=sc.next().charAt(0);
               if(ans=='a')
               {
               System.out.println("Correct answer.");
               m++;
               }
               else
               if(ans=='A')
               {
               System.out.println("Correct answer.");
               m++;
               }
               else
               {
               System.out.println("Wrong answer.");
               System.out.println("Correct answer- a.small");
               }
               System.out.println();
               break;
        }
        else
        System.out.println("Wrong input.Please try again.\n");
        }
        System.out.println("");
        System.out.println("\t*Result*");
        System.out.println("Marks scored-"+m+"/6");
        per=(m/6.0)*100.0;
        System.out.println("Percentage- "+per+"%");
        if(per==100)
        System.out.println("You're a genius!WHHATT A PERFECTION!!!!");
        System.out.println("NOTE:-This quiz should not be attempted by an individual,if he/she has already played it.");
        System.out.println("\t__X");
}
}