import java.util.*;
class Pattern5
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int sp=-1;
        int spinner=n/2+2;
        for(int i=1;i<=n;i++)
        {
            if(i==1||i==n)
            {
                for(int j=1;j<=n;j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                System.out.print("*");
                for(int j=0;j<sp;j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                if(i==(n/2)+1)
                {
                    for(int j=0;j<sp;j++)
                    {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                else
                {
                    for(int j=0;j<spinner;j++)
                    {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for(int j=0;j<sp;j++)
                    {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
            }
            if(i<=n/2)
            {
                sp++;
                spinner-=2;
            }
            else
            {
                sp--;
                spinner+=2;
            }
            System.out.println();
        }
    }
}