import java.util.*;
class Series2
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=(i*(i+1))/2;
        }
        System.out.println(sum);
    }
}