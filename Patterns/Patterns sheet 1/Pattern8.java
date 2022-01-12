import java.util.*;
class Pattern8
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int sp=n-1;
        int val=1;
        int spinner=0;
        for(int i=1;i<2*n;i++)
        {
            for(int j=0;j<sp;j++)
            {
                System.out.print(" ");
            }
            if(i==1)
            {
                System.out.print(val);
            }
            else if(i==2*n-1)
            {
                System.out.print(val);
            }
            else
            {
                System.out.print(val);
                for(int j=0;j<spinner;j++)
                {
                    System.out.print(" ");
                }
                System.out.print(val);
            }
            if(i<n)
            {
                sp--;
                val++;
                spinner+=2;
            }
            else
            {
                sp++;
                val--;
                spinner-=2;
            }
            
            System.out.println();
        }
        
    }
}