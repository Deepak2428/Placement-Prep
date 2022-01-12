import java.util.*;
class factorial
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=scn.nextInt();
        System.out.print("\n Factorial : "+fact(n));
    }
    public static int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n*fact(n-1);
    }
    
    
}