import java.util.*;
class Pattern5
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int sp=n-1;
        int st=1;
        for(int i=1;i<=2*n;i++)
        {
            for(int j=0;j<sp;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<st;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            if(i<(2*n)/2)
            {
                sp--;
                st++;
            }
            else
            {
                sp++;
                st--;
            }
            
        }
        
    }
}