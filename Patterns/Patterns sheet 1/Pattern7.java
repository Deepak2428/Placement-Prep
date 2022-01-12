import java.util.*;
class Pattern7
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int limit=1;
        int st=n;
        for(int i=1;i<=2*n+1;i++)
        {
            for(int j=st,k=1;k<=limit;j--,k++)
            {
                System.out.print(j);
            }
            System.out.println();
            if(i<=(2*n)/2)
            {
                limit++;
            }
            else
            {
                limit--;
            }
        }
        
    }
}