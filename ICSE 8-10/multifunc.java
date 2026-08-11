//MRP.75
import java.util.Scanner;
public class multifunc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=0,inf=0,num2=0,tempnum=0,revnum=0,sq=0,str=0,ch=0,fact=0,sum=0,pro=1,dig=0,dig2=0;double fac=1.0d;
        System.out.println("Enter a number:");
        num=sc.nextInt();
        System.out.println("\nPress 1 to check for Prime number.");
        System.out.println("Press 2 to get the factorial of\b"+num+".");
        System.out.println("Press 3 to get the table of "+num+".");
        System.out.println("Press 4 to check for Niven number.");
        System.out.println("Press 5 to check for Armstrong number.");
        System.out.println("Press 6 to compare "+num+" with a number.");
        System.out.println("Press 7 to check for perfect number.");
        System.out.println("Press 8 to check for composite number.");
        System.out.println("Press 9 to check for deficient number.");
        System.out.println("Press 10 to check for abundant number.");
        System.out.println("Press 11 to get all the digits of "+num+".");
        System.out.println("Press 12 to get the sum of the digits of "+num+".");
        System.out.println("Press 13 to check for spy number.");
        System.out.println("Press 14 to check for cuboid number.");
        System.out.println("Press 15 to check for palindrome number.");
        System.out.println("Press 16 to check for special number.");
        System.out.println("Press 17 to check for neon number.");
        System.out.println("Press 18 to check for duck number.");
        System.out.println("Press 19 to get all the factors of "+num+".");
        System.out.println("Press 20 to check for handsome number.");
        ch=sc.nextInt();
        System.out.println("");
        System.out.println("\tResult");
        switch(ch)
        {
            case 1:
                   for(int i=1;i<=num;i++)
                   {
                      if(num%i==0)
                      fact++;
                   }
                   if(fact==2)
                   System.out.println(num+" is a prime number.");
                   else
                   System.out.println(num+" is not a prime number.");
                   break;
            case 2:
                   for(int a=1;a<=num;a++)
                   fac*=a;
                   System.out.println("Factorial of "+num+ "is "+fac+".");
                   break;
            case 3:
                   for(int j=0;j<=10;j++)
                   System.out.println(num+"x"+j+"="+(num*j));
                   break;
            case 4:
                   for(int c=num;c>0;c/=10)
                   {
                        dig=c%10;
                        sum+=dig;
                   }
                   if(sum==num)
                    System.out.println(num+" is a Niven number.");
                   else
                    System.out.println(num+" is not a Niven number .");
                   break;
            case 5:
                   for(int f=num;f>0;f/=10)
                   {
                        dig=f%10;
                        sum+=dig*dig*dig;
                   }
                  if(sum==num)
                   System.out.println(num+" is an Armstrong number.");
                  else
                   System.out.println(num+" is Not an Armstrong number .");
                  break;
            case 6:
                   System.out.println("Enter another number to compare:");
                   num2=sc.nextInt();
                   if(num>num2)
                   {
                      System.out.println("Largest number is: "+num);
                      System.out.println("Smallest number is: "+num2);
                   }
                   else if(num2>num)
                   {
                      System.out.println("Largest number is: "+num2);
                      System.out.println("Smallest number is: "+num);
                   }
                   else if(num2==num)
                      System.out.println(num2+" and "+num+" are equal.");
                   break;
            case 7:
                   for(int z=1;z<num;z++)
                   {
                       if(num%z==0)
                       sum+=z;
                   }
                   if(sum==num)
                   System.out.println(num+" is a perfect number.");
                   else
                   System.out.println(num+" is not a perfect number.");
                   break;
            case 8:
                   for(int b=1;b<=num;b++)
                   {
                       if(num%b==0)
                       fact++;
                   }
                   if(fact>2)
                   System.out.println(num+" is composite number.");
                   else
                   System.out.println(num+" is not composite number.");
                   break;
            case 9:
                   for(int l=1;l<num;l++)
                   {
                       if(num%l==0)
                       sum+=l;
                   }
                   if(sum<num)
                   System.out.println(num+" is a deficient number.");
                   else
                   System.out.println(num+" is not a deficient number.");
                   break;
            case 10:
                   for(int e=1;e<num;e++)
                   {
                       if(num%e==0)
                       sum+=e;
                   }
                   if(sum>num)
                   System.out.println(num+" is abundant number.");
                   else
                   System.out.println(num+" is not abundant number.");
                   break;
            case 11:
                   for(int y=num;y>0;y/=10)
                   {
                       dig=y%10;
                       System.out.println(dig);
                   }
                   break;
            case 12:
                   for(int w=num;w>0;w/=10)
                   {
                       dig=w%10;
                       sum+=dig;
                   }
                   System.out.println("Sum= "+sum);
                   break;
            case 13:
                   tempnum=num;//another method of counting digits.(*@)?
                   for(int q=1;q>0;q++)
                   {
                       if(tempnum==0)
                       break;
                       dig=tempnum%10;
                       sum+=dig;
                       pro*=dig;
                       tempnum/=10;
                   }
                   if(sum==pro)
                   System.out.println(num+" is a spy number.");
                   else
                   System.out.println(num+" is not a spy number.");
                   break;
            case 14:
                   for(int o=num;o>0;o/=10)
                   {
                       dig=o%10;
                       sum+=dig*dig*dig;
                   }
                   if(sum%2!=0)
                   System.out.println(num+" is a cuboid number.");
                   else
                   System.out.println(num+" is not a cuboid number.");
                   break;
            case 15:
                   for(int x=num;x>0;x/=10)
                   {
                       dig=x%10;
                       revnum=revnum*10+dig;
                   }
                   if(revnum==num)
                   System.out.println(num+" is a palindrome number.");
                   else
                   System.out.println(num+" is not a palindrome number.");
                   break;
            case 16:
                   dig=num%10;
                   for(int u=num;u>0;u/=10)
                   dig2=u%10;
                   if(dig2==dig)
                   System.out.println(num+" is a special number.");
                   else
                   System.out.println(num+" is not a special number.");
                   break;
            case 17:
                   sq=num*num;
                   for(int m=sq;m>0;m/=10)
                   {
                       dig=m%10;
                       sum+=dig;
                   }
                   if(sum==num)
                   System.out.println(num+" is a neon number.");
                   else
                   System.out.println(num+" is not a neon number.");
                   break;
            case 18:
                   for(int h=num;h>0;h/=10)
                   {
                       dig=h%10;
                       if(dig==0)
                       {
                           System.out.println(num+" is a duck number.");
                           break;
                       }
                   }
                   if(dig!=0)
                   System.out.println(num+" is not a duck number.");
                   break;
            case 19:
                   for(int g=1;g<=num;g++)
                   {
                       if(num%g==0)
                       System.out.println(g); 
                   }
                   break;
            case 20:
                   dig=num%10;
                   num2=num/10;
                   for(int n=num2;n>0;n/=10)
                   {
                       dig2=n%10;
                       sum+=dig2;
                   }
                   if(sum==dig)
                   System.out.println(num+" is handsome number.");
                   else
                   System.out.println(num+" is not handsome number.");
                   break;
            default:System.out.println("Invalid Choice.");
        }
    }
}