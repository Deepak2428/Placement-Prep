import java.util.*;
class oddno
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=scn.nextInt();
        odd(n,1);
    }
    public static void odd(int n,int k)
    {
        if(n==0)
        {
            return;
        }
        
            System.out.print(k+" ");
            odd(n-1,k+2);
    }
}