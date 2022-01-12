import java.util.*;
class primeno
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=scn.nextInt();
        prime(n,2);
    }
    public static void prime(int n,int k)
    {
        if(n==0)
        {
            return;
        }
        if(isPrime(k))
        {
            System.out.print(k+" ");
            prime(n-1,k+1);
        }
        else
        {
            prime(n,k+1);
        }
    }
    
    public static boolean isPrime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}