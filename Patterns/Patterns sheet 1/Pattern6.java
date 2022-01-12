import java.util.*;
class Pattern6
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int sp=n-1;
        int st=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<sp;j++)
            {
                System.out.print(" ");
            }
            for(int j=st;j>0;j--)
            {
                System.out.print(j);
            }
            System.out.println();
            sp--;
            st=st+2;
            
        }
        
    }
}