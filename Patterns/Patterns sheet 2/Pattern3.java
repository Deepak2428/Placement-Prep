import java.util.*;
class Pattern3
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                int val=nCr(i,j);
                System.out.print(val+" ");
            }
            System.out.println();
        }
        
    }
    public static int nCr(int n,int r)
    {
        int factN=fact(n);
        int factR=fact(r);
        int factNR=fact(n-r);
        
        return factN/(factR*factNR);
    }
    public static int fact(int n)
    {
        int f=1;
        for(int i=n;i>=1;i--)
        {
            f=f*i;
        }
        return f;
    }
}