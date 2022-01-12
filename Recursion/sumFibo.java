import java.util.*;
class sumFibo
{
    static int a=0;
    static int b=1;
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=scn.nextInt();
        System.out.print(fibo(n));
        
    }
    public static int fibo(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        
        return fibo(n-1)+fibo(n-2);
    }
    
    
}