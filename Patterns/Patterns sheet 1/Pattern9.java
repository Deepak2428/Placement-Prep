import java.util.*;
class Pattern9
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int sp=0;
        int spinner=n+2;
        int k=n-1;
        for(int i=1;i<=n;i++,k--)
        {
            for(int j=0;j<sp;j++)
            {
                System.out.print(" ");
            }
            if(i==n)
            {
                System.out.print((char)(65+k));
                break;
            }
            else
            {
                System.out.print((char)(65+k));
                for(int j=0;j<spinner;j++)
                {
                    System.out.print(" ");
                }
                System.out.print((char)(65+k));
            }
            sp++;
            spinner-=2;
            System.out.println();
        }
        
    }
}