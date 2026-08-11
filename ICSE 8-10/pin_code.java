public class pin_code
{
    public static void main(String args[])
    {
        int pin[]={110061,110001,110029,110023,110055,110006,110019,110033};
        int i,j;
        for(i=0;i<pin.length-1;i++)
        {
            int min=i;
            for(j=i+1;j<pin.length;j++)
            {
                if(pin[min]>pin[j])
                min=j;
            }
            int t=pin[i];
            pin[i]=pin[min];
            pin[min]=t;
        }
        System.out.println("Sorted array:");
        for(int k=0;k<pin.length;k++)
        System.out.print(pin[k]+" ");
    }
}