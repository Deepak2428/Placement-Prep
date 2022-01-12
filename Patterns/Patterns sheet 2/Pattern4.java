import java.util.*;
class Pattern4
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int sp=0;
        int st=1;
        for(int i=1;i<=2*n;i++)
        {
            for(int j=0;j<sp;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<st;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            if(i<n)
            {
                sp++;
                st++;
            }
            else
            {
                sp--;
                st--;
            }
        }
    }
}