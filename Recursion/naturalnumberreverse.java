import java.util.*;
class naturalnumberreverse
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
        System.out.print(n+" ");
        natural(n-1);
    }
}