import java.util.Scanner;
import java.util.Arrays;
public class Array_Special_Methods{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]={22,41,1,67,3,69,100,-5,100000,-100};
        System.out.println("Sorted array:");
        Arrays.sort(a);
        for(int i=0;i<10;i++)
        System.out.print(a[i]+" ");
        System.out.println("\nEnter an element to be searched:");
        int n=sc.nextInt();
        int index=Arrays.binarySearch(a,n);
        if(index<0){
        System.out.println("Element not found.");
        System.exit(0);
        }
        else
        System.out.println("Element found at index- "+index+" and position- "+(index+1));
    }
}