//Cricket game(&&%%);>><<?@#!;MRP.100
import java.util.Scanner;
public class Cricket
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int ch,la=0,runs=0,bowl=0,count=0,count2=0;String nm;
    System.out.println("\t*|WELCOME TO THE CRICKET GAME|*\t\t\tGame owner and creator- ADITYA NARAYAN SINGH");
    System.out.println("\n");
    do
    {
    System.out.println("_");
    System.out.println("\t|MENU OPTIONS|");
    System.out.println("Start game(Press 1)\nHelp(Press 2)\nQuit(Press 0)");
    ch=sc.nextInt();
    if(ch==1)
    {
    System.out.println("_");
    System.out.println("\t*Game started*");
    System.out.println("Enter your name:");
    nm=sc.next();
    System.out.println(nm+" VS COMPUTER");
    System.out.println("Your batting first");
    System.out.println("_");
    while(la==0)
        {
        int cta2=(int)(Math.random()*7);
        System.out.println("Enter any number from 0 to 6 to hit:");
        runs=sc.nextInt();
        System.out.println("Computer bowled "+cta2);
        if(runs<0 || runs>6)
        {
            System.out.println("You have entered a wrong choice.Please try again.");
            System.out.println("NOTE:- Runs will not be counted for wrong choice.");
            System.out.println("");
        }
        if(runs!=cta2 && runs<=6 && runs>=0)
        {
            System.out.println("You scored "+runs+" runs");
            count+=runs;
            System.out.println("");
        }
        if(runs==cta2)
        {
            System.out.println("*YOU ARE OUT!!!!*");
            System.out.println("");
            System.out.println("*Bowling time*");
            while(la==0)
            {
                int cta3=(int)(Math.random()*7);
                System.out.println("Enter any number from 0 to 6 to bowl:");
                bowl=sc.nextInt();
                System.out.println("Computer hit "+cta3);
                if(bowl<0 || bowl>6)
                {
                    System.out.println("You have entered a wrong choice.Please try again.");
                    System.out.println("NOTE:- Runs will not be counted for wrong choice.");
                    System.out.println("");
                }
                if(bowl!=cta3 && bowl>=0 && bowl<=6)
                {
                    System.out.println("Computer scored "+cta3+" runs");
                    count2+=cta3;
                    System.out.println("");
                }
                if(bowl==cta3)
                {
                    System.out.println("*COMPUTER IS OUT!!!!*");
                    System.out.println("");
                    System.out.println("\t**MATCH RESULTS");
                    System.out.println(nm+" scored= "+count+" runs");
                    System.out.println("Computer scored= "+count2+" runs");
                    if(count==count2)
                    System.out.println("DRAWWW!! ^_^");
                    if(count>count2)
                    System.out.println("YOU WON!!! <_^.HURRAY!!");
                    if(count<count2)
                    System.out.println("YOU LOST THE MATCH!! ^~^.ITS OK.");
                    System.out.println("");
                    System.out.println("\n");
                    la++;
                    break;
                }
            }
        }
    }
    la--;
}
else if(ch==2)
{
    System.out.println("");
    System.out.println("\t**RULES OF THE GAME");
    System.out.println("1.Firstly,you will get a menu option.");
    System.out.println("2.You have to enter your choice as any of these- 0,1,2.");
    System.out.println("3.Then you will be redirected as per your choice.");
    System.out.println("4.If you choose 1 as your choice,then game will start.");
    System.out.println("5.If you choose 2 as your choice,then help section will be displayed.");
    System.out.println("6.If you choose 0 as your choice,then you will be permitted to exit the game.");
    System.out.println("7.After starting the game,you will get the chance to bat first.");
    System.out.println("8.Enter any number between 0 to 6 to score runs.");
    System.out.println("9.If your entered number does not match with the computer bowled number,then you will be not out or vice-versa.");
    System.out.println("10.If you are out,then you will have to start bowling.");
    System.out.println("11.Follow the same steps for bowling as in batting mentioned above.");
    System.out.println("12.In the last,after the bowling is over or computer is out,results will be displayed.");
    System.out.println("\n\n\t|A CRICKET GAME CREATED BY ADITYA NARAYAN SINGH|");
    System.out.println("\t*Former student at ST.THOMAS SCHOOL,DHURWA,RANCHI,JHARKHAND-4*");
    System.out.println("\n*Best of luck*");
    System.out.println("\n\n");
}
else if(ch==0)
{
 System.out.println("_");
 System.out.println("You are permitted to exit the game.");
 System.out.println("_");
 break;
}
else
{
 System.out.println("_");
 System.out.println("Invalid input.Please try again.");
}
}while(ch>0 || ch<0);
}
}