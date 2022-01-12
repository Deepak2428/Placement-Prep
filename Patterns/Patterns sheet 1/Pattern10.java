import java.util.*;
class Pattern10
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int sp=0;
        int spinner=n-2;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<sp;j++)
            {
                System.out.print(" ");
            }
            if(i==(n/2)+1)
            {
                System.out.print(i);
            }
            else
            {
                System.out.print(i);
                for(int j=0;j<spinner;j++)
                {
                    System.out.print(" ");
                }
                System.out.print(i);
            }
            
            if(i<=n/2)
            {
                spinner-=2;
                sp++;
            }
            else
            {
                spinner+=2;
                sp--;
            }
            System.out.println();
        }
        
    }
}