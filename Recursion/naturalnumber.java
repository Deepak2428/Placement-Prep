import java.util.*;
class naturalnumber
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=scn.nextInt();
        natural(n);
    }
    public static void natural(int n)
    {
        if(n==0)
        {
            return;
        }
        natural(n-1);
        System.out.print(n+" ");
    }
}