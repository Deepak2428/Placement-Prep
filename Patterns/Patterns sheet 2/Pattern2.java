import java.util.*;
class Pattern2
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int one=0;
        int two=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                int sum=one+two;
                one=two;
                two=sum;
                System.out.print(one+" ");
            }
            System.out.println();
        }
        
    }
}