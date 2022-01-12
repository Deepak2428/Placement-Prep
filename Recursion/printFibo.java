import java.util.*;
class printFibo
{
    static int a=0;
    static int b=1;
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=scn.nextInt();
        System.out.print("0 1 ");
        fibo(n);
    }
    public static void fibo(int n)
    {
        if(n==0)
        {
            return ;
        }
        fibo(n-1);
        System.out.print(a+b+" ");
        int sum=a+b;
        a=b;
        b=sum;
        return ;
    }
    
    
}